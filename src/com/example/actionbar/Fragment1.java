package com.example.actionbar;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {

    private static final String TAG = Fragment1.class.getName();

    @Override
    public void onAttach(Activity act){
        super.onAttach(act);
        Log.d(TAG,"Fragment-onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"Fragment-onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onActivityCreated(Bundle bundle){
        super.onActivityCreated(bundle);
        Log.d(TAG,"Fragment-onActivityCreated");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"Fragment-onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG,"Fragment-onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"Fragment-onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG,"Fragment-onStop");
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d(TAG,"Fragment-onDestroyView");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"Fragment-onDestroy");
    }

    @Override
    public void onDetach(){
        super.onDetach();
        Log.d(TAG,"Fragment-onDetach");
    }

}