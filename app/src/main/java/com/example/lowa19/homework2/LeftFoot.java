package com.example.lowa19.homework2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by kaleolow on 3/25/17.
 */

public class LeftFoot extends Shapes {
    Path leftFoot;

    public LeftFoot(String initName, Paint initPaint) {
        super(initName, initPaint);
    }

    @Override
    public void drawShape(Canvas canvas)
    {
        leftFoot = new Path();
        leftFoot.moveTo(120, 195);
        leftFoot.lineTo(130, 195);
        leftFoot.moveTo(130, 195);
        leftFoot.lineTo(125, 205);
        leftFoot.moveTo(125, 205);
        leftFoot.lineTo(120, 195);
        canvas.drawPath(leftFoot, getShapePaint());
    }

}
