package com.example.myapplication.fragment;

import com.flyco.tablayout.listener.CustomTabEntity;

public class MyTab implements CustomTabEntity {

    private String title;
    private int selectColor;
    private int unselectColor;

    public MyTab(String title, int selectColor, int unselectColor) {
        this.title = title;
        this.selectColor = selectColor;
        this.unselectColor = unselectColor;
    }

    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return selectColor;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unselectColor;
    }
}
