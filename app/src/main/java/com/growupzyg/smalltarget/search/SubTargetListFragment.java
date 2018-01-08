package com.growupzyg.smalltarget.search;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.growupzyg.smalltarget.R;
import com.growupzyg.smalltarget.base.BaseFragment;
import com.growupzyg.smalltarget.model.TargetListModel;
import com.growupzyg.smalltarget.search.adapter.TargetListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYige on 2018/1/8.
 * 分类下的目标列表
 */

public class SubTargetListFragment extends BaseFragment {
    private RecyclerView mRecyclerList;

    public static SubTargetListFragment newInstance(String title) {

        Bundle args = new Bundle();

        SubTargetListFragment fragment = new SubTargetListFragment();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sub_target_list, container, false);
        initView(view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dealEvent();
    }

    private void initView(View view) {
        mRecyclerList = (RecyclerView) view.findViewById(R.id.recycler_list);
    }

    private void dealEvent() {
        TargetListModel targetListModel = new TargetListModel();
        List<TargetListModel> mTargetListModels = new ArrayList<>();
        mTargetListModels.add(targetListModel);
        mTargetListModels.add(targetListModel);
        mTargetListModels.add(targetListModel);
        mTargetListModels.add(targetListModel);
        mTargetListModels.add(targetListModel);
        mTargetListModels.add(targetListModel);
        mTargetListModels.add(targetListModel);
        mTargetListModels.add(targetListModel);
        TargetListAdapter targetListAdapter = new TargetListAdapter(mTargetListModels);
        mRecyclerList.setAdapter(targetListAdapter);
        mRecyclerList.setLayoutManager(new GridLayoutManager(getActivity(), 2));
    }
}
