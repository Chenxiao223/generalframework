package com.example.generalframework.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.generalframework.R;

import butterknife.BindView;

public class StartActivity extends BaseActivity {
    @BindView(R.id.view)
    View view;


    @Override
    public int getLayoutId() {
        return R.layout.activity_start;
    }

    @Override
    public void initView() {
        initImmersionBar(view);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(StartActivity.this, LoginActivity.class));
                finish();
            }
        }, 5000);
    }
}
