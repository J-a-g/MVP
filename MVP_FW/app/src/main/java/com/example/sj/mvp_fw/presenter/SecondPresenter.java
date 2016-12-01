package com.example.sj.mvp_fw.presenter;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.example.sj.mvp_fw.base.BasePresenter;
import com.example.sj.mvp_fw.handler.UIHandler;
import com.example.sj.mvp_fw.interfaces.IDataCallback;
import com.example.sj.mvp_fw.interfaces.IHandler;
import com.example.sj.mvp_fw.interfaces.mViewInterface;


/**
 * Created by Administrator on 2016.12.1.
 */

public class SecondPresenter extends BasePresenter<mViewInterface>{
    private mViewInterface mViewInterface;

    private IDataCallback<Message> iDataCallback;
    //prviate MainModelInterface
    private UIHandler uiHandler = new UIHandler(Looper.getMainLooper());

    public void setiDataCallback(IDataCallback iDataCallback) {
        this.iDataCallback = iDataCallback;
    }

    public SecondPresenter(mViewInterface mViewInterface) {
        this.mViewInterface = mViewInterface;
    }

    public void btn1Onclick(){
        Log.v("TAG","btn1Onclick...");
        uiHandler.setHandler(new IHandler() {
            @Override
            public void handlerMessages(Message msg) {
                iDataCallback.dataCallback(msg);
            }
        });
    }
    public void btn2Onclick(){
        Message msg = new Message();
        uiHandler.handleMessage(msg);
    }
}
