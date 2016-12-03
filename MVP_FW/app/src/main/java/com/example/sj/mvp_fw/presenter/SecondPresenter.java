package com.example.sj.mvp_fw.presenter;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.example.sj.mvp_fw.base.BasePresenter;
import com.example.sj.mvp_fw.handler.UIHandler;
import com.example.sj.mvp_fw.interfaces.IDataCallback;
import com.example.sj.mvp_fw.interfaces.IHandler;
import com.example.sj.mvp_fw.interfaces.IMainView;
import com.example.sj.mvp_fw.interfaces.ISecondView;
import com.example.sj.mvp_fw.view.SecondActivity;


/**
 * Created by Administrator on 2016.12.1.
 */

public class SecondPresenter extends BasePresenter<ISecondView>{
    private ISecondView iSecondView;
    private IMainView iMainView;

    private IDataCallback<Message> iDataCallback;
    //prviate MainModelInterface
    private UIHandler uiHandler = new UIHandler(Looper.getMainLooper());

    public void setiDataCallback(IDataCallback iDataCallback) {
        this.iDataCallback = iDataCallback;
    }

    public SecondPresenter() {
    }

    public SecondPresenter(SecondActivity iSecondView) {
        this.iSecondView = iSecondView;
        this.iMainView = iSecondView;
    }


    public void btn1Onclick(){
        Log.v("TAG","btn1Onclick...");
        uiHandler.setHandler(new IHandler() {
            @Override
            public void handlerMessages(Message msg) {
                Log.v("TAG","handlerMessages...");
                iDataCallback.dataCallback(msg);
            }
        });
    }
    public void btn2Onclick(){
        Message msg = new Message();
        msg.arg1 = 1;
        uiHandler.handleMessage(msg);
        iSecondView.netChanged();
        iMainView.showData("test");
        //Message msg = new Message();
        //uiHandler.handleMessage(msg);
    }
}
