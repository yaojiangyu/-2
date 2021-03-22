package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.myapplication.fragment.FourFragment;
import com.example.myapplication.fragment.MyTab;
import com.example.myapplication.fragment.OneFragment;
import com.example.myapplication.fragment.ThreeFragment;
import com.example.myapplication.fragment.TwoFragment;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    private ThreeFragment threeFragment;
    private FourFragment fourFragment;
    private ArrayList<CustomTabEntity> customTabEntities = new ArrayList<>();

    private FrameLayout frame;
    private CommonTabLayout common;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        frame = (FrameLayout) findViewById(R.id.frame);
        common = (CommonTabLayout) findViewById(R.id.common);

        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();
        threeFragment = new ThreeFragment();
        fourFragment = new FourFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame,oneFragment)
                .add(R.id.frame,twoFragment)
                .add(R.id.frame,threeFragment)
                .add(R.id.frame,fourFragment)
                .commit();
        showFragment(oneFragment);

        customTabEntities.add(new MyTab("一",R.mipmap.per1_t,R.mipmap.per1_f));
        customTabEntities.add(new MyTab("二",R.mipmap.per1_t,R.mipmap.per1_f));
        customTabEntities.add(new MyTab("三",R.mipmap.per1_t,R.mipmap.per1_f));
        customTabEntities.add(new MyTab("四",R.mipmap.per1_t,R.mipmap.per1_f));

        common.setTabData(customTabEntities);

        common.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                if (position == 0){
                    showFragment(oneFragment);
                }else if (position == 1){
                    showFragment(twoFragment);
                }else if (position == 2){
                    showFragment(threeFragment);
                }else if (position == 3){
                    showFragment(fourFragment);
                }
                common.hideMsg(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
    }

    public void showFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .hide(oneFragment)
                .hide(twoFragment)
                .hide(threeFragment)
                .hide(fourFragment)
                .show(fragment)
                .commit();
    }
}