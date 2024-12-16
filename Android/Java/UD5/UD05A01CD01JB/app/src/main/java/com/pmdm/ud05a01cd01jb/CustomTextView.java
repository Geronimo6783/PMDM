package com.pmdm.ud05a01cd01jb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

public class CustomTextView extends androidx.appcompat.widget.AppCompatTextView {
    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
        int textColor = a.getColor(R.styleable.CustomTextView_customTextColor, Color.BLACK);
        float textSize = a.getDimension(R.styleable.CustomTextView_customFontSize, 16);
        setTextColor(textColor);
        setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
        a.recycle();
    }

    public void setCustomFontSize(int i) {
        setTextSize(TypedValue.COMPLEX_UNIT_PX, i);
    }

    public void setCustomTextColor(int valor) {
        setTextColor(valor);
    }
}

