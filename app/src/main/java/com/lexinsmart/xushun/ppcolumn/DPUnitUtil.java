package com.lexinsmart.xushun.ppcolumn;

import android.content.Context;

/**
 * Created by xushun on 2017/4/25.
 */

public class DPUnitUtil {

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
