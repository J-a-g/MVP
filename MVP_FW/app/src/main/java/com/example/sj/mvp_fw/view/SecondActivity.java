package com.example.sj.mvp_fw.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sj.mvp_fw.R;
import com.example.sj.mvp_fw.base.BaseActivity;
import com.example.sj.mvp_fw.base.BasePresenter;
import com.example.sj.mvp_fw.interfaces.IDataCallback;
import com.example.sj.mvp_fw.interfaces.IMainView;
import com.example.sj.mvp_fw.interfaces.ISecondView;
import com.example.sj.mvp_fw.presenter.SecondPresenter;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


/**
 * Created by Administrator on 2016.11.30.
 */
public class SecondActivity extends BaseActivity<ISecondView, BasePresenter<ISecondView>> implements IMainView, ISecondView, IDataCallback<Message>, View.OnClickListener {
    private SecondPresenter secondPresenter;
    private Button btn1, btn2;

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
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
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
        Log.v("TAG","showData--->"+data);
    }

    @Override
    public void netChanged() {
        Log.v("TAG","netChanged....");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
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
        Log.v("TAG","dataCallback");
        Toast.makeText(this, "dataCallback....", Toast.LENGTH_SHORT).show();
    }
}
