package com.zmm.mvpsimpledemo2.presenter;

import com.zmm.mvpsimpledemo2.view.MainView;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/10/31
 * Time:下午2:26
 */

public interface MainPresenter extends BasePresenter<MainView>{

    void onPre(String msg);

    void onNext(String msg);

    void onBack();
}
