package com.itheima.dfy.mvplayerdemo.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * 作者：dfy on 21/4/2017 01:21
 * <p>
 * 邮箱：dengfuyao@163.com
 */

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = LayoutInflater.from(getContext()).inflate(getResLayoutId(),null);
            ButterKnife.bind(this,rootView);
        init();
            return rootView;
    }

    protected abstract void init();

    protected abstract int getResLayoutId();
}
