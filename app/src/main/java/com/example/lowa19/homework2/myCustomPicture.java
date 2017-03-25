package com.example.lowa19.homework2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;

import static android.graphics.Color.rgb;

/**
 * Created by lowa19 on 3/23/2017.
 */
public class myCustomPicture extends SurfaceView {
    Paint black_paintbrush_fill, yellow_paintbrush_fill, white_paintbrush_fill, customPaint1;
    Path nose, leftFoot, rightFoot, leftArm, rightArm;

    public myCustomPicture(Context context) {
        super(context);
        setWillNotDraw(false);
    }


    @Override
    public void onDraw(Canvas canvas) {




        white_paintbrush_fill = new Paint();
        white_paintbrush_fill.setColor(Color.WHITE);
        white_paintbrush_fill.setStyle(Paint.Style.FILL);

        customPaint1 = new Paint();
        //customPaint1.

        //canvas.drawCircle(100, 100, 50, black_paintbrush_fill); //body


        //Penguin nose
        nose = new Path();
        nose.moveTo(145, 145);
        nose.lineTo(155, 145);
        nose.moveTo(155, 145);
        nose.lineTo(160, 160);
        nose.moveTo(160, 160);
        nose.lineTo(145, 145);
        canvas.drawPath(nose, yellow_paintbrush_fill);

        //Penguin left arm


        //Penguin right arm


        //Penguin left foot


        //Penguin right foot

    }

    public Paint setCustomPaint()
    {
        Paint temp = new Paint();
        //int redVal = getRedSeekBar().getProgress();
        //int greenVal = greenSeekBar.getProgress();
        //int blueVal = blueSeekBar.getProgress();
       // temp.setColor(rgb(redVal, greenVal, blueVal));
        temp.setStyle(Paint.Style.FILL);
        return temp;
        //add code to set color of the geometric shape
    }

}
