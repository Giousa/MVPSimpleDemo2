package com.zmm.mvpsimpledemo2.presenter.impl;


import com.zmm.mvpsimpledemo2.LoginActivity;
import com.zmm.mvpsimpledemo2.presenter.MainPresenter;
import com.zmm.mvpsimpledemo2.view.MainView;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/10/31
 * Time:下午2:29
 */

public class MainPresenterImpl implements MainPresenter {

    private MainView mMainView;

    @Override
    public void attachView(MainView mainView) {
        mMainView = mainView;
    }

    @Override
    public void detachView() {
        mMainView = null;
    }

    @Override
    public void onPre(String msg) {
        mMainView.show(msg);
    }

    @Override
    public void onNext(String msg) {
        mMainView.show(msg);
    }

    @Override
    public void onBack() {
        mMainView.preActivity(LoginActivity.class);
    }
}
