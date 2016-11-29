package com.example.sj.mvp_fw.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by SJ on 2016.11.29.
 */

public abstract class BaseActivity extends Activity {
    private final static String TAG ="BaseActivity";

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    protected void initView(){

    }
    protected abstract void test();

}
