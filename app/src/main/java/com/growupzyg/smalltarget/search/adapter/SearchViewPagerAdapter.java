package com.growupzyg.smalltarget.search.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.growupzyg.smalltarget.search.SubTargetListFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYige on 2018/1/8.
 */

public class SearchViewPagerAdapter extends FragmentPagerAdapter {
    private List<String> mTitleList = new ArrayList<>();

    public SearchViewPagerAdapter(FragmentManager fm, List<String> mTitleList) {
        super(fm);
        this.mTitleList = mTitleList;
    }


    @Override
    public Fragment getItem(int position) {
        return SubTargetListFragment.newInstance(mTitleList.get(position));
    }

    @Override
    public int getCount() {
        return mTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }
}
