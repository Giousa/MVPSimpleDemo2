package com.zmm.mvpsimpledemo2.presenter;

import com.zmm.mvpsimpledemo2.view.LoginView;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/10/31
 * Time:下午2:26
 */

public interface BasePresenter<T> {

    void attachView(T t);

    void detachView();
}
