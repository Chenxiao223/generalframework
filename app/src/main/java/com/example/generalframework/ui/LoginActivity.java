package com.example.generalframework.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.blankj.utilcode.util.ToastUtils;
import com.example.generalframework.R;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {
    @BindView(R.id.view)
    View view;
    @BindView(R.id.et_name)
    EditText et_name;
    @BindView(R.id.et_pwd)
    EditText et_pwd;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.btn_login)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                String name = et_name.getText().toString().trim();
                String pwd = et_pwd.getText().toString().trim();
                if (name.equals("abc") && pwd.equals("123")) {
                    startActivity(new Intent(this, HomeActivity.class));
                    finish();
                } else {
                    ToastUtils.showShort("账号或密码错误");
                }
                break;
        }
    }

    @Override
    public void initView() {
        initImmersionBar(view);
    }
}
