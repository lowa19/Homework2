package com.example.lowa19.homework2;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by kaleolow on 3/25/17.
 */

public class Eyes extends Shapes {
    private final int yCoor= 125;
    private final int radius = 5;
    private final int xLeft = 125;
    private final int xRight = 175;

    public Eyes(String initName, Paint initPaint) {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        canvas.drawCircle(xLeft, yCoor, radius, getShapePaint()); //left eye
        canvas.drawCircle(xRight, yCoor, radius, getShapePaint()); //right eye
    }
}
