package com.skylib.utils.ui;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public class UiUtil {
    private Context mContext;

    public UiUtil(Context context) {
        mContext = context;
    }

    public void showShortToast(String msg) {
        private_showToast(msg, Toast.LENGTH_SHORT);
    }

    public void showLongToast(String msg) {
        private_showToast(msg, Toast.LENGTH_LONG);
    }


    //////////////////////////////////////

    private void private_showToast(String msg, int length) {
        if (TextUtils.isEmpty(msg)) {
            msg = "...";
        }
        Toast.makeText(mContext, msg, length).show();
    }
}
