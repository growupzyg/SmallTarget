package com.growupzyg.smalltarget;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.growupzyg.smalltarget.search.SearchActivity;

/**
 * Created by ZhangYiGe on 2018/1/7 0007.
 */

public class SmallTargetFragment extends Fragment {
    private ImageView mImageAdd;

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
        initView(view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dealEvent();
    }

    private void dealEvent() {
        mImageAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }

    private void initView(View view) {
        mImageAdd = (ImageView) view.findViewById(R.id.image_add);
    }
}
