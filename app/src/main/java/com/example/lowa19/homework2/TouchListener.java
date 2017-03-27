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
        currentShape = myActivity.getMyPictureLayout().getShape(xcoor,ycoor);
        r = currentShape.getShapeRed();
        g = currentShape.getShapeGreen();
        b = currentShape.getShapeBlue();
        myActivity.getSelectedElementText().setText(currentShape.getName()); //display name of body part tapped
        myActivity.getRedText().setText(Integer.toString(r));
        myActivity.getGreenText().setText(Integer.toString(g));
        myActivity.getBlueText().setText(Integer.toString(b));
        myActivity.setRedSeekBar(r);
        myActivity.setGreenSeekBar(g);
        myActivity.setBlueSeekBar(b);

        return false;
    }


}
