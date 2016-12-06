package com.example.sj.mvp_fw.presenter;

import com.example.sj.mvp_fw.base.BasePresenter;
import com.example.sj.mvp_fw.interfaces.IMainModel;
import com.example.sj.mvp_fw.interfaces.IMainView;
import com.example.sj.mvp_fw.model.MainModelImpl;
import com.example.sj.mvp_fw.view.MainActivity;


/**
 * Created by SJ on 2016.11.29.
 */

public class MainPresenter extends BasePresenter<IMainView> {

    private IMainModel iMainModel = new MainModelImpl();

    private IMainView iMainView;

    public MainPresenter(IMainView iMainView) {
        bindView(iMainView);
    }


    public void setData(){
        iMainView.showData(iMainModel.getData());

    }

    @Override
    protected void bindView(IMainView IView) {
        this.iMainView = IView;
    }
}
