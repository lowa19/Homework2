package com.example.lowa19.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    myCustomPicture myPictureLayout;
    private SeekBar redSeekBar, greenSeekBar, blueSeekBar;
    private TextView redText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myPictureLayout = new myCustomPicture(this);
        setContentView(myPictureLayout);
        //setContentView(R.layout.activity_main);

        redSeekBar = (SeekBar) findViewById(R.id.rSeekBar);
        redText = (TextView) findViewById(R.id.redText);
        redText.setText("Red Value = " + redSeekBar.getProgress());

        //redSeekBar.setOnSeekBarChangeListener();


    }
}
