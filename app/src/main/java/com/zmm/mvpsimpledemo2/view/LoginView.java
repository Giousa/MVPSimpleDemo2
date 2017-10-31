package com.zmm.mvpsimpledemo2.view;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/10/31
 * Time:下午2:24
 */

public interface LoginView {
    void onLoginSuccess();

    void onLoginFailed();

    void onLoginEmpty();

    void onLoginError();

    void nextActivity(Class c);
}
