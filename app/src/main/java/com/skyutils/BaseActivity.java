package com.skyutils;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.skylib.SkyRouter;

public class BaseActivity extends AppCompatActivity {
    public SkyRouter skyRouter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        skyRouter = new SkyRouter(getApplicationContext());
    }
}
