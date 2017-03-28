package com.example.lowa19.homework2;

import android.graphics.Color;
import android.graphics.Paint;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by lowa19 on 3/23/2017.
 */
public class SeekBarListener implements SeekBar.OnSeekBarChangeListener {
    private TextView myText;
    private Paint changedPaint;
    private Shapes currentShape;
    private MainActivity myActivity;

    public SeekBarListener(MainActivity activity, TextView initText)
    {
        this.myText = initText;
        currentShape = activity.getMyPictureLayout().getCurrentShape();
        myActivity = activity;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b)
    {
        if(seekBar.getId() == R.id.rSeekBar)
        {
            //create a temporary paint
            changedPaint = new Paint();
            //set the paint to the changed seekbar value
            changedPaint.setARGB(255, i, currentShape.getShapeGreen(), currentShape.getShapeBlue());
            changedPaint.setStyle(Paint.Style.FILL);
            //sets the shape to the new paint and the textview to new value
            myActivity.getMyPictureLayout().getCurrentShape().setShapePaint(changedPaint);
            myText.setText("Red Value = " + i);
            //redraw the surfaceview
            myActivity.getMyPictureLayout().invalidate();
        }
        else if(seekBar.getId() == R.id.gSeekBar) {
            changedPaint = new Paint();
            changedPaint.setARGB(255, currentShape.getShapeRed(), i, currentShape.getShapeBlue());
            myActivity.getMyPictureLayout().getCurrentShape().setShapePaint(changedPaint);
            myText.setText("Green Value = " + i);
            myActivity.getMyPictureLayout().invalidate();
        }
        else if(seekBar.getId() == R.id.bSeekBar) {
            changedPaint = new Paint();
            changedPaint.setARGB(255, currentShape.getShapeRed(), currentShape.getShapeGreen(), i);
            myActivity.myPictureLayout.getCurrentShape().setShapePaint(changedPaint);
            myText.setText("Blue Value = " + i);
            myActivity.getMyPictureLayout().invalidate();
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
