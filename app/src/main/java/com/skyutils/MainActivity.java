package com.skyutils;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skyRouter.getUiUtil().showShortToast("this is SkyUtils first call");
        skyRouter.getUiUtil().showLongToast("come on");
    }
}