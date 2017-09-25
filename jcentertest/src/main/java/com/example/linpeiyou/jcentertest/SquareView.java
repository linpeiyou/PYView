package com.example.linpeiyou.jcentertest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by linpeiyou on 2017/9/25.
 */

public class SquareView extends View {

    public SquareView(Context context) {
        super(context);
    }

    public SquareView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
