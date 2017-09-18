package com.example.linpeiyou.pyview.drip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by linpeiyou on 2017/9/18.
 */

public class DripView extends View {

    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private int mColor = Color.BLUE;

    public DripView(Context context) {
        super(context);
        init();
    }

    public DripView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DripView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint.setColor(mColor);
        mPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthSpecSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSpecSize = (int) ((double) widthSpecSize * 1.353);
        setMeasuredDimension(widthSpecSize, heightSpecSize);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        double radius = width / 2;
        double circleToBottom = height - width;

        // height/width=1.353   width/height=0.739
        double xLeft = radius - radius * Math.sqrt(circleToBottom * circleToBottom +
                2 * radius * circleToBottom) / (radius + circleToBottom);
        double yLeft = radius + radius * radius / (radius + circleToBottom);

        double xRight = width - xLeft;
        double yRight = yLeft;
        canvas.drawCircle(width / 2, width / 2, width / 2, mPaint);
        canvas.drawLine((int) xLeft, (int) yLeft, (int) radius, height, mPaint);
        canvas.drawLine((int) xRight, (int) yRight, (int) radius, height, mPaint);
    }
}













