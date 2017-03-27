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

    private Beak beak;
    private Eyes eyes;
    private LeftArm leftArm;
    private RightArm rightArm;
    private PenguinBody body;
    private RightFoot rightFoot;
    private LeftFoot leftFoot;
    public Paint yellow_paintbrush_fill, white_paintbrush_fill, black_paintbrush_fill;

    public myCustomPicture(Context context) {
        super(context);
        setWillNotDraw(false);
    }


    @Override
    public void onDraw(Canvas canvas) {
        //create each initial paint
        yellow_paintbrush_fill = new Paint();
        yellow_paintbrush_fill.setColor(Color.YELLOW);
        yellow_paintbrush_fill.setStyle(Paint.Style.FILL);
        black_paintbrush_fill = new Paint();
        black_paintbrush_fill.setColor(Color.BLACK);
        black_paintbrush_fill.setStyle(Paint.Style.FILL);
        white_paintbrush_fill = new Paint();
        white_paintbrush_fill.setColor(Color.WHITE);
        white_paintbrush_fill.setStyle(Paint.Style.FILL);

        //create penguin's body parts and draw on the view
        body = new PenguinBody("Body", black_paintbrush_fill);
        body.drawShape(canvas);
        beak = new Beak("Beak", yellow_paintbrush_fill);
        beak.drawShape(canvas);
        eyes = new Eyes("Eyes", white_paintbrush_fill);
        eyes.drawShape(canvas);
        leftArm = new LeftArm("Left Arm", black_paintbrush_fill);
        leftArm.drawShape(canvas);
        rightArm = new RightArm("Right Arm", black_paintbrush_fill);
        rightArm.drawShape(canvas);
        leftFoot = new LeftFoot("Left Foot", yellow_paintbrush_fill);
        leftFoot.drawShape(canvas);
        rightFoot = new RightFoot("Right Foot", yellow_paintbrush_fill);
        rightFoot.drawShape(canvas);
    }

    /**
     *
     * @param x x coordinate from touch event
     * @param y y coordinate from touch event
     * @return corresponding shape to the touch
     */
    public Shapes getShape(int x, int y)
    {
        if(eyeTouch(x,y))
        {
            return this.eyes;
        }
        else if (beakTouch(x,y))
        {
            return this.beak;
        }
        else if (leftArmTouch(x,y))
        {
            return this.leftArm;
        }
        else if(rightArmTouch(x,y))
        {
            return this.rightArm;
        }
        else if(leftFootTouch(x,y))
        {
            return this.leftFoot;
        }
        else if (rightFootTouch(x,y))
        {
            return this.rightFoot;
        }
        else if (bodyTouch(x,y))
        {
            return this.body;
        }
        else
        {
            return null;
        }
    }
    public boolean eyeTouch(int x, int y)
    {
        int yCoor= 125;
        int radius = 5;
        int xLeft = 125;
        int xRight = 175;

        if(x>xLeft-radius && x<xLeft+radius && y>yCoor-radius && y<yCoor+radius)
        {
            return true;
        }
        else if (x>xRight-radius && x<xRight+radius && y>yCoor-radius && y<yCoor+radius)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean beakTouch(int x, int y)
    {
        int leftPointX = 145;
        int rightPointX = 155;
        int leftAndRightY = 145;
        int middlePointXY = 160;

        if(x>leftPointX && x<rightPointX && y>leftAndRightY && y<middlePointXY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean leftArmTouch(int x, int y)
    {
        if(x>90 && x<135 && y>150 && y<185)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean rightArmTouch(int x, int y)
    {
        if(x>185 && x<210 && y>150 && y<185)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean leftFootTouch(int x, int y)
    {
        if(x>120 && x<130 && y>195 && y<205)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean rightFootTouch(int x, int y)
    {
        if(x>170 && x<180 && y>195 && y<205)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean bodyTouch(int x, int y) //check body last because bottom most layer on drawing
    {
        int yCoor= 150;
        int radius = 50;
        int xCoor = 150;
        if(x>xCoor-radius && x<xCoor+radius && y>yCoor-radius && y<yCoor+radius)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
