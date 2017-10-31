package com.zmm.mvpsimpledemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.zmm.mvpsimpledemo2.model.User;
import com.zmm.mvpsimpledemo2.presenter.impl.LoginPresenterImpl;
import com.zmm.mvpsimpledemo2.view.LoginView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginView{

    @InjectView(R.id.et_username)
    EditText mEtUsername;
    @InjectView(R.id.et_password)
    EditText mEtPassword;

    private LoginPresenterImpl mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);

        mLoginPresenter = new LoginPresenterImpl();
        mLoginPresenter.attachView(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        mLoginPresenter.login(new User(mEtUsername.getText().toString(),mEtPassword.getText().toString()));
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFailed() {
        Toast.makeText(this,"登录失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginEmpty() {
        Toast.makeText(this,"用户名或密码不能为空",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError() {
        Toast.makeText(this,"登录账户不存在",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void nextActivity(Class c) {
        Intent intent = new Intent(LoginActivity.this,c);
        startActivity(intent);
        finish();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLoginPresenter.detachView();
    }
}
