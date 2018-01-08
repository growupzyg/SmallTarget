package com.growupzyg.smalltarget.search.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.growupzyg.smalltarget.R;
import com.growupzyg.smalltarget.model.TargetListModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYige on 2018/1/8.
 */
public class TargetListAdapter extends RecyclerView.Adapter<TargetListAdapter.ViewHolder> {
    private List<TargetListModel> mTargetListModels = new ArrayList<>();

    public TargetListAdapter(List<TargetListModel> mTargetListModels) {
        this.mTargetListModels = mTargetListModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_target_list, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mTargetListModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View rootView;

        public ViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
        }
    }
}