package com.growupzyg.smalltarget;

import android.os.Bundle;
import android.support.annotation.IdRes;

import com.growupzyg.smalltarget.base.BaseActivity;
import com.growupzyg.smalltarget.utils.ActivityUtils;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends BaseActivity {
    private BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        dealEvent();
    }

    private void initView() {
        mBottomBar = (BottomBar) findViewById(R.id.bottomBar);
    }

    private void dealEvent() {
        mBottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_small_target) {
                    // TODO: 2018/1/7 0007 小目标页面
                    ActivityUtils.replace(getSupportFragmentManager(), R.id.layout_content, SmallTargetFragment.newInstance());
                } else if (tabId == R.id.tab_find) {
                    // TODO: 2018/1/7 0007 发现页面
                    ActivityUtils.replace(getSupportFragmentManager(), R.id.layout_content, FoundFragment.newInstance());
                } else if (tabId == R.id.tab_message) {
                    // TODO: 2018/1/7 0007 消息页面
                    ActivityUtils.replace(getSupportFragmentManager(), R.id.layout_content, MessageFragment.newInstance());
                } else if (tabId == R.id.tab_my_home) {
                    // TODO: 2018/1/7 0007 我的页面
                    ActivityUtils.replace(getSupportFragmentManager(), R.id.layout_content, MyHomeFragment.newInstance());
                }
            }
        });
    }
}
