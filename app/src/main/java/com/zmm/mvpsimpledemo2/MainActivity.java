package com.zmm.mvpsimpledemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.zmm.mvpsimpledemo2.presenter.impl.MainPresenterImpl;
import com.zmm.mvpsimpledemo2.view.MainView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView{


    private MainPresenterImpl mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        mMainPresenter = new MainPresenterImpl();
        mMainPresenter.attachView(this);
    }

    @OnClick({R.id.btn_pre, R.id.btn_next, R.id.btn_back})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_pre:
                mMainPresenter.onPre("之前的");
                break;
            case R.id.btn_next:
                mMainPresenter.onNext("之后的");
                break;
            case R.id.btn_back:
                mMainPresenter.onBack();
                break;
        }
    }

    @Override
    public void show(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void preActivity(Class c) {
        Intent intent = new Intent(MainActivity.this,c);
        startActivity(intent);
        finish();
    }
}
