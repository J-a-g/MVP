package com.example.sj.mvp_fw.view;

import android.os.Bundle;
import android.widget.TextView;

import com.example.sj.mvp_fw.R;
import com.example.sj.mvp_fw.base.BaseActivity;
import com.example.sj.mvp_fw.base.BasePresenter;
import com.example.sj.mvp_fw.interfaces.mViewInterface;
import com.example.sj.mvp_fw.presenter.MainPresenter;

public class MainActivity extends BaseActivity implements mViewInterface {

    private MainPresenter mainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        mainPresenter.setData();
    }

    @Override
    protected void test() {

    }

    @Override
    protected BasePresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void showData(String data) {
        TextView textView = (TextView)findViewById(R.id.textview);
        textView.setText(data);
    }
}
