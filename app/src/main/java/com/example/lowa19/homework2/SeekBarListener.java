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
        currentShape = activity.getCurrentShape();
        myActivity = activity;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b)
    {
        if(seekBar.getId() == R.id.rSeekBar) {
            changedPaint = new Paint();
            changedPaint.setARGB(255, i, currentShape.getShapeGreen(), currentShape.getShapeBlue());
            myActivity.getCurrentShape().setShapePaint(changedPaint);
            myText.setText("Red Value = " + i);
            myActivity.getMyPictureLayout().invalidate();
        }
        else if(seekBar.getId() == R.id.gSeekBar) {
            changedPaint = new Paint();
            changedPaint.setARGB(255, currentShape.getShapeRed(), i, currentShape.getShapeBlue());
            myActivity.getCurrentShape().setShapePaint(changedPaint);
            myText.setText("Green Value = " + i);
            myActivity.getMyPictureLayout().invalidate();
        }
        else if(seekBar.getId() == R.id.bSeekBar) {
            changedPaint = new Paint();
            changedPaint.setARGB(255, currentShape.getShapeRed(), currentShape.getShapeGreen(), i);
            myActivity.getCurrentShape().setShapePaint(changedPaint);
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
