package com.example.lowa19.homework2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by lowa19 on 3/25/2017.
 */
public class PenguinBody extends Shapes {
    private final int circleXY = 100;
    private final int circleRad = 50;
    public Paint black_paintbrush_fill;

    public PenguinBody(String initName, Paint initPaint)
    {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        black_paintbrush_fill = new Paint();
        black_paintbrush_fill.setColor(Color.BLACK);
        black_paintbrush_fill.setStyle(Paint.Style.FILL);

        canvas.drawCircle(circleXY, circleXY, circleRad, getShapePaint());
    }
}
