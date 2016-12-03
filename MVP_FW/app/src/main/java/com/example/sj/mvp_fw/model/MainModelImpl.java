package com.example.sj.mvp_fw.model;

import com.example.sj.mvp_fw.interfaces.IMainModel;

/**
 * Created by SJ on 2016.11.29.
 */

public class MainModelImpl implements IMainModel{
    @Override
    public void saveData(String data) {

    }

    @Override
    public String getData() {
        return "hello JAG!";
    }
}
