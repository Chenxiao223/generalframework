package com.example.generalframework.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.generalframework.R;

public class MyWorkOrderFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_work_order, container, false);
    }

    @Override
    protected void initImmersion() {
        super.initImmersion();
        statusBarConfig().titleBar(R.id.title).init();
    }
}
