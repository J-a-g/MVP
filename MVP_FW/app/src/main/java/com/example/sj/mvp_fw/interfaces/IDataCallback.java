package com.example.sj.mvp_fw.interfaces;

import android.os.Message;

/**
 * Created by Administrator on 2016.12.1.
 */

public interface IDataCallback<T> {
    void dataCallback(T data);
}
