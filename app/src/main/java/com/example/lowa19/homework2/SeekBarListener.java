package com.example.lowa19.homework2;

import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by lowa19 on 3/23/2017.
 */
public class SeekBarListener implements SeekBar.OnSeekBarChangeListener {
    private TextView myText;

    public SeekBarListener(TextView initText)
    {
        this.myText = initText;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b)
    {
        myText.setText("Red Value = " + i);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
