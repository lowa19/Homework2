package com.example.lowa19.homework2;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by kaleolow on 3/25/17.
 */

public class Beak extends Shapes {
    Path nose;
    public Paint yellow_paintbrush_fill;

    public Beak(String initName , Paint initPaint)
    {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        yellow_paintbrush_fill = new Paint();
        yellow_paintbrush_fill.setColor(Color.YELLOW);
        yellow_paintbrush_fill.setStyle(Paint.Style.FILL);

        nose = new Path();
        nose.moveTo(145, 145);
        nose.lineTo(155, 145);
        nose.moveTo(155, 145);
        nose.lineTo(160, 160);
        nose.moveTo(160, 160);
        nose.lineTo(145, 145);
        canvas.drawPath(nose, getShapePaint());
    }
}
