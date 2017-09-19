package com.example.linpeiyou.pyview.freestyle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by linpeiyou on 2017/9/20.
 */

public class LearnPathView extends View {

    Paint mPaint = new Paint();

    public LearnPathView(Context context) {
        super(context);
        init();
    }

    public LearnPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LearnPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        Path path = new Path();
        path.moveTo(50, 50);
        path.lineTo(150, 50);
        path.lineTo(150, 250);
        path.lineTo(50, 250);
        canvas.drawPath(path, mPaint);


        Path path2 = new Path();
        path2.moveTo(50, 300);
        path2.lineTo(300, 300);
        path2.lineTo(300, 400);
        path2.lineTo(50, 400);
        path2.close();
        canvas.drawPath(path2, mPaint);

    }
}











