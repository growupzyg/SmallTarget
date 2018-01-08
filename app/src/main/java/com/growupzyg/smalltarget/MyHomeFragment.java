package com.growupzyg.smalltarget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.growupzyg.smalltarget.base.BaseFragment;

/**
 * Created by ZhangYiGe on 2018/1/7 0007.
 */

public class MyHomeFragment extends BaseFragment {
    public static MyHomeFragment newInstance() {
        
        Bundle args = new Bundle();
        
        MyHomeFragment fragment = new MyHomeFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_home, container, false);
        return view;
    }
}
