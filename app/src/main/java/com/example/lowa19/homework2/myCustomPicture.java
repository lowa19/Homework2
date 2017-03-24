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
        black_paintbrush_fill = new Paint();
        black_paintbrush_fill.setColor(Color.BLACK);
        black_paintbrush_fill.setStyle(Paint.Style.FILL);

        yellow_paintbrush_fill = new Paint();
        yellow_paintbrush_fill.setColor(Color.YELLOW);
        yellow_paintbrush_fill.setStyle(Paint.Style.FILL);

        white_paintbrush_fill = new Paint();
        white_paintbrush_fill.setColor(Color.WHITE);
        white_paintbrush_fill.setStyle(Paint.Style.FILL);

        customPaint1 = new Paint();
        //customPaint1.

        canvas.drawCircle(100, 100, 50, black_paintbrush_fill); //body
        canvas.drawCircle(125, 125, 5, white_paintbrush_fill); //left eye
        canvas.drawCircle(175, 125, 5, white_paintbrush_fill); //right eye

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
        leftArm = new Path();
        leftArm.moveTo(100, 150);
        leftArm.lineTo(90, 185);
        leftArm.moveTo(90, 185);
        leftArm.lineTo(135, 185);
        leftArm.moveTo(135, 185);
        leftArm.lineTo(100, 150);
        canvas.drawPath(leftArm, black_paintbrush_fill);

        //Penguin right arm
        rightArm = new Path();
        rightArm.moveTo(200, 150);
        rightArm.lineTo(210, 185);
        rightArm.moveTo(210, 185);
        rightArm.lineTo(185, 185);
        rightArm.moveTo(185, 185);
        rightArm.lineTo(200, 150);
        canvas.drawPath(rightArm, black_paintbrush_fill);

        //Penguin left foot
        leftFoot = new Path();
        leftFoot.moveTo(120, 195);
        leftFoot.lineTo(130, 195);
        leftFoot.moveTo(130, 195);
        leftFoot.lineTo(125, 205);
        leftFoot.moveTo(125, 205);
        leftFoot.lineTo(120, 195);
        canvas.drawPath(leftFoot, yellow_paintbrush_fill);

        //Penguin right foot
        rightFoot = new Path();
        rightFoot.moveTo(170, 195);
        rightFoot.lineTo(180, 195);
        rightFoot.moveTo(180, 195);
        rightFoot.lineTo(155, 205);
        rightFoot.moveTo(155, 205);
        rightFoot.lineTo(170, 195);
        canvas.drawPath(rightFoot, yellow_paintbrush_fill);
    }

    public Paint changeColor()
    {
        Paint temp = new Paint();
        //int redVal = redSeekBar().getProgress();
        //int greenVal = greenSeekBar.getProgress();
        //int blueVal = blueSeekBar.getProgress();
        //temp.setColor(rgb(redVal, greenVal, blueVal));
        temp.setStyle(Paint.Style.FILL);
        return temp;
        //add code to set color of the geometric shape
    }

}
