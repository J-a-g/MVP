package com.example.sj.mvp_fw.model;

import com.example.sj.mvp_fw.interfaces.MainModelInterface;

/**
 * Created by SJ on 2016.11.29.
 */

public class MainModelImpl implements MainModelInterface{
    @Override
    public void saveData(String data) {

    }

    @Override
    public String getData() {
        return "hello JAG!";
    }
}
