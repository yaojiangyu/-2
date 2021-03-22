package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hyphenate.EMMessageListener;
import com.hyphenate.chat.EMClient;
import com.hyphenate.easeui.EaseConstant;
import com.hyphenate.easeui.ui.EaseChatFragment;

public class MainActivity2 extends AppCompatActivity {

    private EaseChatFragment chatFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //new出EaseChatFragment或其子类的实例123456
        chatFragment = new EaseChatFragment();
        //传入参数
        Bundle args = new Bundle();
        args.putInt(EaseConstant.EXTRA_CHAT_TYPE, EaseConstant.CHATTYPE_SINGLE);
        args.putString(EaseConstant.EXTRA_USER_ID, "22");
        chatFragment.setArguments(args);
        getSupportFragmentManager().beginTransaction().add(R.id.container,
                chatFragment).commit();

    }

    @Override
    protected void onResume() {
        super.onResume();
        // EMClient.getInstance().chatManager().addMessageListener(msgListener);
    }
    @Override
    protected void onStop() {
        super.onStop();
        //
        EMMessageListener msgListener = null;
        EMClient.getInstance().chatManager().removeMessageListener(msgListener);
    }
}