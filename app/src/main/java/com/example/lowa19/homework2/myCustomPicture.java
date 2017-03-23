package com.example.lowa19.homework2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.SurfaceView;

/**
 * Created by lowa19 on 3/23/2017.
 */
public class myCustomPicture extends SurfaceView {
    Paint black_paintbrush_fill, yellow_paintbrush_fill, white_paintbrush_fill;
    Path triangle;
    public myCustomPicture(Context context) {
        super(context);
    }
}

@Override
public void onDraw(Canvas canvas)
{
    black_paintbrush_fill = new Paint();
    black_paintbrush_fill.setColor(Color.BLACK);
    black_paintbrush_fill.setStyle(Paint.Style.FILL);

    yellow_paintbrush_fill = new Paint();
    yellow_paintbrush_fill.setColor(Color.YELLOW);
    yellow_paintbrush_fill.setStyle(Paint.Style.FILL);

    white_paintbrush_fill = new Paint();
    white_paintbrush_fill.setColor(Color.WHITE);
    white_paintbrush_fill.setStyle(Paint.Style.FILL);

    canvas.drawCircle(100, 100, 50, black_paintbrush_fill); //body
    canvas.drawCircle(125, 125, 5, white_paintbrush_fill); //left eye
    canvas.drawCircle(175, 125, 5, white_paintbrush_fill); //right eye

    //Penguin nose
    triangle = new Path();
    triangle.moveTo(145,145);
    triangle.lineTo(155,145);
    triangle.moveTo(155,145);
    triangle.lineTo(160,160);
    triangle.moveTo(160,160);
    triangle.lineTo(145,145);
    canvas.drawPath(triangle, yellow_paintbrush_fill);
}
