package com.example.lowa19.homework2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by kaleolow on 3/25/17.
 */

public class RightFoot extends Shapes {
    Path rightFoot;

    public RightFoot(String initName, Paint initPaint) {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        rightFoot = new Path();
        rightFoot.moveTo(170, 195);
        rightFoot.lineTo(180, 195);
        rightFoot.moveTo(180, 195);
        rightFoot.lineTo(155, 205);
        rightFoot.moveTo(155, 205);
        rightFoot.lineTo(170, 195);
        canvas.drawPath(rightFoot, getShapePaint());
    }

}
