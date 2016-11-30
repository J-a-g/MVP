package com.example.sj.mvp_fw.presenter;

import com.example.sj.mvp_fw.base.BasePresenter;
import com.example.sj.mvp_fw.interfaces.MainModelInterface;
import com.example.sj.mvp_fw.interfaces.mViewInterface;
import com.example.sj.mvp_fw.model.MainModelImpl;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by SJ on 2016.11.29.
 */

public class MainPresenter extends BasePresenter<mViewInterface> {

    private MainModelInterface mainModelInterface = new MainModelImpl();

    private mViewInterface mViewInterface;

    public MainPresenter(mViewInterface mViewInterface) {
        this.mViewInterface = mViewInterface;
    }


    public void setData(){
        mViewInterface.showData(mainModelInterface.getData());
    }

}
