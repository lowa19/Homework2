package com.example.lowa19.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    myCustomPicture myPictureLayout;
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
        SeekBarListener myListener = new SeekBarListener(redText);
        redSeekBar.setOnSeekBarChangeListener(myListener);
    }


}
