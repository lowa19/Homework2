package com.example.lowa19.homework2;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {
    myCustomPicture myPictureLayout; //surface view
    private SeekBar redSeekBar, greenSeekBar, blueSeekBar;
    private TextView redText, greenText, blueText, selectedElement;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPictureLayout = (myCustomPicture) findViewById(R.id.surfaceView);

        //get references to views on GUI
        redSeekBar = (SeekBar) findViewById(R.id.rSeekBar);
        redText = (TextView) findViewById(R.id.redText);
        greenSeekBar = (SeekBar)findViewById(R.id.gSeekBar);
        greenText = (TextView) findViewById(R.id.greenText);
        blueSeekBar = (SeekBar)findViewById(R.id.bSeekBar);
        blueText = (TextView) findViewById(R.id.blueText);
        selectedElement = (TextView)findViewById(R.id.currElement);

        //register listeners
        TouchListener myTouchListener = new TouchListener(this);
        myPictureLayout.setOnTouchListener(myTouchListener);
        SeekBarListener myRedListener = new SeekBarListener(this,redText);
        redSeekBar.setOnSeekBarChangeListener(myRedListener);
        SeekBarListener myGreenListener = new SeekBarListener(this,greenText);
        greenSeekBar.setOnSeekBarChangeListener(myGreenListener);
        SeekBarListener myBlueListener = new SeekBarListener(this,blueText);
        blueSeekBar.setOnSeekBarChangeListener(myBlueListener);
    }

    //GETTER AND SETTER METHODS
    public myCustomPicture getMyPictureLayout()
    {
        return this.myPictureLayout;
    }
    public TextView getSelectedElementText()
    {
        return this.selectedElement;
    }
    public TextView getRedText()
    {
        return this.redText;
    }
    public TextView getGreenText()
    {
        return this.greenText;
    }
    public TextView getBlueText()
    {
        return this.blueText;
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
