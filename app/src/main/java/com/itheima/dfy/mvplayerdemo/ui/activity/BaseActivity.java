package com.itheima.dfy.mvplayerdemo.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * 作者：dfy on 21/4/2017 01:25
 * <p>
 * 邮箱：dengfuyao@163.com
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResLayoutId());
        ButterKnife.bind(this);
        init();
    }

    protected abstract void init();

    protected abstract int getResLayoutId();
}
