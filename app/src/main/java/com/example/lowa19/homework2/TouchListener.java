package com.example.lowa19.homework2;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by kaleolow on 3/24/17.
 */

public class TouchListener implements View.OnTouchListener {
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int xcoor = (int)motionEvent.getX();
        int ycoor = (int)motionEvent.getY();
        return false;
    }
}
