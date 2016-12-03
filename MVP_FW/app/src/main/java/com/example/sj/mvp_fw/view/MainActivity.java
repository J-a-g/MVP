package com.example.sj.mvp_fw.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sj.mvp_fw.R;
import com.example.sj.mvp_fw.base.BaseActivity;
import com.example.sj.mvp_fw.base.BasePresenter;
import com.example.sj.mvp_fw.interfaces.IMainView;
import com.example.sj.mvp_fw.presenter.MainPresenter;


public class MainActivity extends BaseActivity<IMainView,BasePresenter<IMainView>> implements IMainView,View.OnClickListener{

    private MainPresenter mainPresenter;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mainPresenter = new MainPresenter(this);
        mainPresenter = (MainPresenter)mPresenter;
        mainPresenter.setData();
        setListener();
    }

    @Override
    protected void initfindViewById() {

    }

    @Override
    protected void test() {

    }

    @Override
    protected BasePresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void setListener() {
        textView.setOnClickListener(this);
    }

    @Override
    public void showData(String data) {
        textView = (TextView)findViewById(R.id.textview);
        textView.setText(data);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textview:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
            default:
                break;
        }
    }
}
