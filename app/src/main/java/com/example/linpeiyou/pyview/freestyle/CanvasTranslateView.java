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
 */

public class CanvasTranslateView extends View {

    Paint mPaint = new Paint();

    public CanvasTranslateView(Context context) {
        super(context);
        init();
    }

    public CanvasTranslateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CanvasTranslateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        canvas.save();

        canvas.drawRect(100, 100, 400, 300, mPaint);
        canvas.translate(120, 120);

        mPaint.setColor(Color.BLUE);
        canvas.drawRect(100, 100, 400, 300, mPaint);

        canvas.restore();
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(200, 200, 500, 400, mPaint);
        //mPaint.setColor(Color.GRAY);
    }
}











