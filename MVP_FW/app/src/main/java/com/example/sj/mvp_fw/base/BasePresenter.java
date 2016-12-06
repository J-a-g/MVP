package com.example.sj.mvp_fw.base;

import android.util.Log;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2016.11.30.
 */

public abstract class BasePresenter<T> {

    protected Reference<T> mViewRef;

    public void attachView(T view){
        Log.v("TAG","attachView..");
        mViewRef = new WeakReference<T>(view);
    }
    public T getView(){
        return mViewRef.get();
    }
    public boolean isViewAttached(){
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detacheView(){
        Log.v("TAG","detacheView..");
        if(mViewRef != null){
            mViewRef.clear();
            mViewRef = null;
        }
    }

    protected abstract void bindView(T IView);

}
