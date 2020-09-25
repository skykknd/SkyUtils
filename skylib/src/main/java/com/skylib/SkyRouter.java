package com.skylib;

import android.content.Context;

import com.skylib.utils.ui.UiUtil;

public class SkyRouter {
    private Context mContext;

    public SkyRouter(Context mContext) {
        this.mContext = mContext;
    }

    public UiUtil getUiUtil() {
        return new UiUtil(mContext);
    }
}
