package com.example.sj.mvp_fw.handler;


import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.example.sj.mvp_fw.interfaces.IHandler;

/**
 * Created by Administrator on 2016.12.1.
 */

public class UIHandler extends Handler {
    private IHandler handler;

    public UIHandler(IHandler handler) {
        this.handler = handler;
    }

    public UIHandler(Looper looper) {
        super(looper);
    }

    public UIHandler(Looper looper, IHandler handler) {
        super(looper);
        this.handler = handler;
    }

    public void setHandler(IHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        Log.v("TAG","handleMessage...1");
        if(handler != null){
            Log.v("TAG","handleMessage...2");
            handler.handlerMessages(msg);
        }
    }
}
