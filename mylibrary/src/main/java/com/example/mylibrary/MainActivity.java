package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements QuContract.IView{

    private Button btn;
    private QuContract.IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter = new QPresenter(MainActivity.this);
                presenter.queryData();
            }
        });
    }

    @Override
    public void queryDataSuccess(OneEntity oneEntity) {

    }

    @Override
    public void queryDataError(int code, String msg) {

    }
}