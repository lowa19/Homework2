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
        this.myActivity = activity;
    }

    /**
     * This method sets the color of the current selected shape to
     * a new color made from changing a value in the existing RGB
     * @param seekBar
     * @param i
     * @param b
     */
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b)
    {
        currentShape = myActivity.getMyPictureLayout().getCurrentShape();
        if(seekBar.getId() == R.id.rSeekBar)
        {
            //create a temporary paint
            changedPaint = new Paint();
            //set the paint to the changed seekbar value
            changedPaint.setColor(Color.rgb(seekBar.getProgress(), currentShape.getShapeGreen(), currentShape.getShapeBlue()));
            //changedPaint.setARGB(255, i, currentShape.getShapeGreen(), currentShape.getShapeBlue());
            changedPaint.setStyle(Paint.Style.FILL);
            //sets the shape to the new paint and the textview to new value
            currentShape.setShapePaint(changedPaint);
            myText.setText("Red Value = " + i);
        }
        else if(seekBar.getId() == R.id.bSeekBar) {
            changedPaint = new Paint();
            changedPaint.setColor(Color.rgb(currentShape.getShapeRed(), currentShape.getShapeGreen(), seekBar.getProgress()));
            //changedPaint.setARGB(255, currentShape.getShapeRed(), currentShape.getShapeGreen(), i);
            currentShape.setShapePaint(changedPaint);
            myText.setText("Blue Value = " + i);
        }
        else if(seekBar.getId() == R.id.gSeekBar) {
            changedPaint = new Paint();
            changedPaint.setColor(Color.rgb(currentShape.getShapeRed(), seekBar.getProgress(), currentShape.getShapeBlue()));
            //changedPaint.setARGB(255, currentShape.getShapeRed(), i, currentShape.getShapeBlue());
            changedPaint.setStyle(Paint.Style.FILL);
            currentShape.setShapePaint(changedPaint);
            myText.setText("Green Value = " + i);
        }
        myActivity.getMyPictureLayout().invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
