package com.pmdm.ud05a01cd01jb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class CustomTextView2 extends AppCompatTextView {

    public CustomTextView2(Context context) {
        super(context);
    }

    public CustomTextView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint borderPaint = new Paint();
        borderPaint.setColor(Color.BLUE);
        borderPaint.setStyle(Paint.Style.STROKE);
        borderPaint.setStrokeWidth(5);

        Rect rect = new Rect();
        getLocalVisibleRect(rect);
        canvas.drawRect(rect, borderPaint);

        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = Math.min(MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.getSize(heightMeasureSpec));
        int measureSpec = MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY);
        super.onMeasure(measureSpec, measureSpec);
    }
}

