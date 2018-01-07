package com.growupzyg.smalltarget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ZhangYiGe on 2018/1/7 0007.
 */

public class SmallTargetFragment extends Fragment {
    public static SmallTargetFragment newInstance() {
        
        Bundle args = new Bundle();
        
        SmallTargetFragment fragment = new SmallTargetFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_small_target, container, false);
        return view;
    }
}
