package com.example.lowa19.homework2;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by kaleolow on 3/24/17.
 */

public class TouchListener implements View.OnTouchListener {
    MainActivity myActivity;
    public TouchListener(MainActivity activity)
    {
        this.myActivity = activity;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int xcoor = (int)motionEvent.getX();
        int ycoor = (int)motionEvent.getY();
        int r,g,b;
        if(eyeTouch(xcoor, ycoor))
        {
            //get shape paint
            //call getRed(), getGreen(), getBlue(); on the paint and set to r,g,b
            // example r = myActivity.getShape().getShapePaint.getRed();
            r = 1;
            g = 1;
            b = 1;
            myActivity.setRedSeekBar(r);
            myActivity.setGreenSeekBar(g);
            myActivity.setBlueSeekBar(b);
        }

        return false;
    }

    public boolean eyeTouch(int x, int y)
    {
        int yCoor= 125;
        int radius = 5;
        int xLeft = 125;
        int xRight = 175;

        if(x>xLeft && x<xLeft+radius && y>yCoor && y<yCoor+radius)
        {
            return true;
        }
        else if (x>xRight && x<xRight+radius && y>yCoor && y<yCoor+radius)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
