package com.zmm.mvpsimpledemo2.presenter;


import com.zmm.mvpsimpledemo2.model.User;
import com.zmm.mvpsimpledemo2.view.LoginView;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/10/31
 * Time:下午1:51
 */

public interface LoginPresenter extends BasePresenter<LoginView>{

    void login(User user);
}
