package com.pmdm.ud05a01cd01jb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class CustomTextView3 extends AppCompatTextView {

    private String title = "Title";
    private String subtitle = "Subtitle";
    private int titleColor = Color.BLACK;
    private float titleSize = 24f;
    private int subtitleColor = Color.GRAY;
    private float subtitleSize = 16f;
    private int colorBar = Color.BLUE;

    public CustomTextView3(Context context) {
        super(context);
        init(null);
    }

    public CustomTextView3(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomTextView3(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.CustomTextView3);
            titleColor = typedArray.getColor(R.styleable.CustomTextView3_titleColor, Color.BLACK);
            titleSize = typedArray.getDimension(R.styleable.CustomTextView3_titleSize, 24f);
            subtitleColor = typedArray.getColor(R.styleable.CustomTextView3_subtitleColor, Color.GRAY);
            subtitleSize = typedArray.getDimension(R.styleable.CustomTextView3_subtitleSize, 16f);
            colorBar = typedArray.getColor(R.styleable.CustomTextView3_colorBar, Color.BLUE);
            typedArray.recycle();
        } else {
            // Valores predeterminados si se crea programáticamente
            /*cuando instancias CustomTextView3 mediante código Java (es decir, usando new CustomTextView3(this)),
            la vista no hereda las propiedades de estilo y atributos XML como en tu definición del layout.
            La razón es que el método init() solo toma en cuenta atributos XML si recibe un AttributeSet.
             Cuando creas el objeto programáticamente, este atributo es null y, por tanto,
             se ignoran los valores XML predeterminados.*/
            titleColor = Color.BLACK;
            titleSize = 24f;
            subtitleColor = Color.GRAY;
            subtitleSize = 16f;
            colorBar = Color.BLUE;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();

        // Dibujar el título
        paint.setColor(titleColor);
        paint.setTextSize(titleSize);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText(title, 20f, titleSize + 20f, paint);

        // Dibujar el subtítulo
        paint.setColor(subtitleColor);
        paint.setTextSize(subtitleSize);
        paint.setTypeface(Typeface.DEFAULT);
        canvas.drawText(subtitle, 20f, titleSize + subtitleSize + 40f, paint);

        // Dibujar la barra
        paint.setColor(colorBar);
        paint.setStrokeWidth(8f);
        canvas.drawLine(
                20f,
                titleSize + subtitleSize + 60f,
                getWidth() - 20f,
                titleSize + subtitleSize + 60f,
                paint
        );
    }

    public void setTitle(String title) {
        this.title = title;
        invalidate(); // Redibujar el TextView
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        invalidate(); // Redibujar el TextView
    }

    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
        invalidate(); // Redibujar el TextView
    }

    public void setSubtitleColor(int subtitleColor) {
        this.subtitleColor = subtitleColor;
        invalidate(); // Redibujar el TextView
    }

    public void setColorBar(int colorBar) {
        this.colorBar = colorBar;
        invalidate(); // Redibujar el TextView
    }

}
