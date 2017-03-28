package com.example.lowa19.homework2;

import android.graphics.Paint;
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
        Shapes currentShape;
        //get the shape corresponding to the touch
        currentShape = myActivity.getMyPictureLayout().getShape(xcoor,ycoor);
        //get the RGB values of the current shape
        r = currentShape.getShapeRed();
        g = currentShape.getShapeGreen();
        b = currentShape.getShapeBlue();
        //set the text views to the name of the selected shape and its RGB values
        myActivity.getSelectedElementText().setText(currentShape.getName()); //display name of body part tapped
        myActivity.getRedText().setText(Integer.toString(r));
        myActivity.getGreenText().setText(Integer.toString(g));
        myActivity.getBlueText().setText(Integer.toString(b));
        //set the seek bars to the right positions
        myActivity.setRedSeekBar(r);
        myActivity.setGreenSeekBar(g);
        myActivity.setBlueSeekBar(b);
        //save the position touched for later reference
        myActivity.getMyPictureLayout().setCurrentTouch(xcoor, ycoor);
        return false;
    }


}
