package com.growupzyg.smalltarget.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by ZhangYiGe on 2018/1/7 0007.
 */

public class ActivityUtils {
    public static void replace(FragmentManager fragmentManager, int containerViewId, Fragment fragment) {
        fragmentManager
                .beginTransaction()
                .replace(containerViewId, fragment)
                .commit();
    }
}
