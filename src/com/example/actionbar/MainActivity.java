
package com.example.actionbar;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("TAB 1")
                .setTabListener(new MainTabListener<Fragment1>(this, "f1", Fragment1.class)));
        actionBar.addTab(actionBar.newTab().setText("TAB 2")
                .setTabListener(new MainTabListener<Fragment2>(this, "f2", Fragment2.class)));
    }

    /**
     * ActionBar のタブリスナー
     */
    public static class MainTabListener<T extends Fragment> implements TabListener {

        private Fragment fragment;
        private final Activity activity;
        private final String tag;
        private final Class<T> cls;

        public MainTabListener(Activity activity, String tag, Class<T> cls){
            Log.d(TAG, "MainTabListene#Constructor");
            this.activity = activity;
            this.tag = tag;
            this.cls = cls;
        }

        @Override
        public void onTabReselected(Tab tab, FragmentTransaction ft) {
            Log.d(TAG, "MainTabListene#onTabReselected");
        }

        @Override
        public void onTabSelected(Tab tab, FragmentTransaction ft) {
            Log.d(TAG, "MainTabListene#onTabSelected");
            if (fragment == null) {
                fragment = Fragment.instantiate(activity, cls.getName());
                ft.add(android.R.id.content, fragment, tag);
            } else {
                ft.attach(fragment);
            }
        }

        @Override
        public void onTabUnselected(Tab tab, FragmentTransaction ft) {
            Log.d(TAG, "MainTabListene#onTabUnselected");
            if (fragment != null) {
                ft.detach(fragment);
            }
        }
    }

}
