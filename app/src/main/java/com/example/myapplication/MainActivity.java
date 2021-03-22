package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private ImageView img;
    private LinearLayout lin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        img = (ImageView) findViewById(R.id.img);
        lin = (LinearLayout) findViewById(R.id.lin);

        init();

        lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void init(){
        ObjectAnimator translationX = ObjectAnimator.ofFloat(img, "translationX", 0, 100);
        ObjectAnimator rotationX = ObjectAnimator.ofFloat(img, "rotationX", 0, 360);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(4000);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.play(translationX).before(rotationX);
        animatorSet.start();

    }
}