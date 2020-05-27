package com.example.generalframework.fragment;

import android.Manifest;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.generalframework.R;
import com.permissionx.guolindev.PermissionX;

import javax.security.auth.callback.Callback;

import butterknife.OnClick;

public class HomeFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    protected void initImmersion() {
        super.initImmersion();
        statusBarConfig().titleBar(R.id.title).init();
    }

}
