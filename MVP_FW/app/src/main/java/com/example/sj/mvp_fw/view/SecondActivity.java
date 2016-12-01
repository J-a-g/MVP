package com.example.sj.mvp_fw.view;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sj.mvp_fw.R;
import com.example.sj.mvp_fw.base.BaseActivity;
import com.example.sj.mvp_fw.base.BasePresenter;
import com.example.sj.mvp_fw.interfaces.IDataCallback;
import com.example.sj.mvp_fw.interfaces.mViewInterface;
import com.example.sj.mvp_fw.presenter.SecondPresenter;

/**
 * Created by Administrator on 2016.11.30.
 */

public class SecondActivity extends BaseActivity<mViewInterface,BasePresenter<mViewInterface>> implements mViewInterface,IDataCallback<Message>,View.OnClickListener{
    private SecondPresenter secondPresenter;
    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        initfindViewById();
        setListener();
        secondPresenter = (SecondPresenter) mPresenter;
        secondPresenter.setiDataCallback(this);
    }

    @Override
    protected void initfindViewById() {
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
    }

    @Override
    protected void test() {

    }

    @Override
    protected BasePresenter createPresenter() {
        return new SecondPresenter(this);
    }

    @Override
    protected void setListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void showData(String data) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                secondPresenter.btn1Onclick();
                break;
            case R.id.btn2:
                secondPresenter.btn2Onclick();
                break;
            default:
                break;
        }
    }

    @Override
    public void dataCallback(Message data) {
        Toast.makeText(this,"dataCallback....",Toast.LENGTH_SHORT);
    }
}
