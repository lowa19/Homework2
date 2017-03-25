package com.example.lowa19.homework2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by kaleolow on 3/25/17.
 */

public class RightArm extends Shapes {
    Path rightArm;

    public RightArm(String initName, Paint initPaint) {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        rightArm = new Path();
        rightArm.moveTo(200, 150);
        rightArm.lineTo(210, 185);
        rightArm.moveTo(210, 185);
        rightArm.lineTo(185, 185);
        rightArm.moveTo(185, 185);
        rightArm.lineTo(200, 150);
        canvas.drawPath(rightArm, getShapePaint());
    }
}
