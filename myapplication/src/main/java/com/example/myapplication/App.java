package com.example.myapplication;

import android.app.Application;

import com.hyphenate.chat.EMClient;
import com.hyphenate.chat.EMOptions;
import com.hyphenate.easeui.EaseUI;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        EMOptions options = new EMOptions();
// 默认添加好友时，是不需要验证的，改成需要验证
        options.setAcceptInvitationAlways(false);

        //初始化
        if (EaseUI.getInstance().init(getApplicationContext(), options)){
            //在做打包混淆时，关闭debug模式，避免消耗不必要的资源
            EMClient.getInstance().setDebugMode(true);

        }
    }
}
