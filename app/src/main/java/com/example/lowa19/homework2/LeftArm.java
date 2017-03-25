package com.example.lowa19.homework2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by kaleolow on 3/25/17.
 */

public class LeftArm extends Shapes {
    Path leftArm;

    public LeftArm(String initName, Paint initPaint)
    {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        leftArm = new Path();
        leftArm.moveTo(100, 150);
        leftArm.lineTo(90, 185);
        leftArm.moveTo(90, 185);
        leftArm.lineTo(135, 185);
        leftArm.moveTo(135, 185);
        leftArm.lineTo(100, 150);
        canvas.drawPath(leftArm, getShapePaint());
    }
}
