package com.growupzyg.smalltarget.base;


import android.support.v4.app.Fragment;

import io.realm.Realm;

/**
 * Created by ZhangYige on 2018/1/8.
 */

public class BaseFragment extends Fragment {
    /**
     * 获取Realm实例
     *
     * @return
     */
    protected Realm getRealm() {
        return ((BaseActivity) getActivity()).getRealm();
    }
}
