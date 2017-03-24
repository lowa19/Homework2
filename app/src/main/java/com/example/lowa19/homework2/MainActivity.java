package com.example.lowa19.homework2;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.graphics.Color.rgb;

//TODO make click listeners for the surface view
//TODO when the shape clicked it sets seekbars to correct RGB
//TODO when seekbar is moved it updates the color of the shape
//TODO set limits for the seekbar

public class MainActivity extends AppCompatActivity {
    myCustomPicture myPictureLayout; //surface view
    private SeekBar redSeekBar, greenSeekBar, blueSeekBar;
    private TextView redText, greenText, blueText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myPictureLayout = new myCustomPicture(this);
        setContentView(myPictureLayout);
        //setContentView(R.layout.activity_main);

        //get references to views on GUI
        redSeekBar = (SeekBar) findViewById(R.id.rSeekBar);
        redText = (TextView) findViewById(R.id.redText);
        greenSeekBar = (SeekBar)findViewById(R.id.gSeekBar);
        greenText = (TextView) findViewById(R.id.greenText);
        blueSeekBar = (SeekBar)findViewById(R.id.bSeekBar);
        blueText = (TextView) findViewById(R.id.blueText);

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
}
