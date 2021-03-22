package com.example.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

    private int mTextColor;
    private int mTextSize;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0, 0);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr, 0);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs, defStyleAttr, defStyleRes);
    }

    public void init(Context context,AttributeSet attrs, int defStyleAttr, int defStyleRes){
        TypedArray ta = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, defStyleAttr, defStyleRes);
        mTextColor = ta.getColor(R.styleable.CustomView_yao_text_color,30);
        mTextSize = (int) ta.getDimension(R.styleable.CustomView_yao_text_size,30);
        ta.recycle();
    }

    private Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {

        paint.setTextSize(mTextSize);
        paint.setColor(mTextColor);

        paint.setColor(Color.BLUE);

        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(20);
        canvas.drawCircle(80,80,50,paint);

        super.onDraw(canvas);
    }
}
