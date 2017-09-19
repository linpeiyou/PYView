package com.example.linpeiyou.pyview.freestyle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by linpeiyou on 2017/9/20.
 *
 * 学习Paint，Canvas类
 */

public class LearnPaintCanvasView extends View {

    Paint mPaint = new Paint();

    public LearnPaintCanvasView(Context context) {
        super(context);
        init();
    }

    public LearnPaintCanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LearnPaintCanvasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10);
        mPaint.setShadowLayer(10, 15, 15, Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRGB(255, 255, 255);
        canvas.drawLine(200, 200, 600, 200, mPaint);
        canvas.drawRect(200, 420, 600, 520, mPaint);
        canvas.drawCircle(400, 800, 100, mPaint);
        canvas.drawText("这是画出来的文本", 200, 1000, mPaint);
    }
}













