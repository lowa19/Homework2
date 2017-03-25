package com.example.lowa19.homework2;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by lowa19 on 3/25/2017.
 */
public class PenguinBody extends Shapes {
    private final int circleXY = 100;
    private final int circleRad = 50;

    public PenguinBody(String initName, Paint initPaint)
    {
        super(intiName, initPaint);

    }

    @Override
    public void drawMe(Canvas canvas)
    {
        canvas.drawCircle(100, 100, 50, shapePaint);
    }
}
