package com.example.sj.mvp_fw.base;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;

import com.example.sj.mvp_fw.handler.UIHandler;
import com.example.sj.mvp_fw.interfaces.mViewInterface;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by SJ on 2016.11.29.
 */

public abstract class BaseActivity<V,T extends  BasePresenter<V>> extends Activity {
    private final static String TAG ="BaseActivity";

    protected T mPresenter;

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
        initView();
        mPresenter = createPresenter();
        mPresenter.attachView((V)this);
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
        mPresenter.detacheView();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    protected void initView(){

    }
    protected abstract void initfindViewById();

    protected abstract void test();

    protected abstract T createPresenter();

    protected abstract void setListener();


}
