package com.growupzyg.smalltarget.search;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.growupzyg.smalltarget.R;
import com.growupzyg.smalltarget.base.BaseActivity;
import com.growupzyg.smalltarget.search.adapter.SearchViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends BaseActivity {

    private ImageView mImageBack;
    private TextView mTextSearch;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<String> mTitleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
        dealEvent();
    }

    private void initView() {
        mImageBack = (ImageView) findViewById(R.id.image_back);
        mTextSearch = (TextView) findViewById(R.id.text_search);
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
    }

    private void dealEvent() {
        mImageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initTitleData();
        SearchViewPagerAdapter adapter = new SearchViewPagerAdapter(getSupportFragmentManager(), mTitleList);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initTitleData() {
        mTitleList.add("热门");
        mTitleList.add("生活");
        mTitleList.add("教育");
        mTitleList.add("运动");
        mTitleList.add("健康");
        mTitleList.add("工作");
    }

}
