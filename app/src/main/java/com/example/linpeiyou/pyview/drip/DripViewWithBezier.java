package com.example.linpeiyou.pyview.drip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by linpeiyou on 2017/9/19.
 */

public class DripViewWithBezier extends View {

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    int mColor = Color.RED;

    public DripViewWithBezier(Context context) {
        super(context);
        init();
    }

    public DripViewWithBezier(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DripViewWithBezier(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint.setColor(mColor);
        mPaint.setStrokeWidth(2);
        mPaint.setStyle(Paint.Style.STROKE);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Path path = new Path();
        //path.moveTo(200,700);
        //path.quadTo(50,900,200,910);
        //path.quadTo(350,900,200,700);
        path.moveTo(width / 2, 0);
        path.quadTo(width - 150, height + 200, width / 2, height);
        path.quadTo(width + 150, height + 200, width / 2, 0);
        canvas.drawPath(path, mPaint);
    }
}













