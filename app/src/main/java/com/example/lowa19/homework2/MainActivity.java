package com.example.lowa19.homework2;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.graphics.Color.rgb;

//TODO make touch listeners for the surface view
//TODO when the shape touched it sets seekbars to correct RGB
//TODO when seekbar is moved it updates the color of the shapes
//TODO set limits for the seekbar; 0-255

public class MainActivity extends AppCompatActivity {
    myCustomPicture myPictureLayout; //surface view
    private SeekBar redSeekBar, greenSeekBar, blueSeekBar;
    private TextView redText, greenText, blueText, selectedElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myPictureLayout = new myCustomPicture(this);
        setContentView(myPictureLayout);

        //get references to views on GUI
        redSeekBar = (SeekBar) findViewById(R.id.rSeekBar);
        redText = (TextView) findViewById(R.id.redText);
        greenSeekBar = (SeekBar)findViewById(R.id.gSeekBar);
        greenText = (TextView) findViewById(R.id.greenText);
        blueSeekBar = (SeekBar)findViewById(R.id.bSeekBar);
        blueText = (TextView) findViewById(R.id.blueText);
        selectedElement = (TextView)findViewById(R.id.currElement);

        //register listeners
        TouchListener myTouchListener = new TouchListener();
        myPictureLayout.setOnTouchListener(myTouchListener);
        SeekBarListener myRedListener = new SeekBarListener(redText);
        redSeekBar.setOnSeekBarChangeListener(myRedListener);
        SeekBarListener myGreenListener = new SeekBarListener(greenText);
        greenSeekBar.setOnSeekBarChangeListener(myGreenListener);
        SeekBarListener myBlueListener = new SeekBarListener(blueText);
        blueSeekBar.setOnSeekBarChangeListener(myBlueListener);
    }
    public SeekBar getRedSeekBar()
    {
        return this.redSeekBar;
    }
    public SeekBar getGreenSeekBar()
    {
        return this.greenSeekBar;
    }
    public SeekBar getBlueSeekBar()
    {
        return this.blueSeekBar;
    }
    public int getRedSeekBarValue()
    {
     return this.redSeekBar.getProgress();
    }
    public int getGreenSeekBarValue()
    {
        return this.greenSeekBar.getProgress();
    }
    public int getBlueSeekBarValue()
    {
        return this.blueSeekBar.getProgress();
    }
    public void setRedSeekBar(int i )
    {
        redSeekBar.setProgress(i);
    }
    public void setGreenSeekBar(int i )
    {
        greenSeekBar.setProgress(i);
    }
    public void setBlueSeekBar(int i )
    {
        blueSeekBar.setProgress(i);
    }

}
