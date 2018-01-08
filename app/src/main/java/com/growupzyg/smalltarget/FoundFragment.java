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

public class FoundFragment extends BaseFragment {
    public static FoundFragment newInstance() {
        
        Bundle args = new Bundle();
        
        FoundFragment fragment = new FoundFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_found, container, false);
        return view;
    }
}
