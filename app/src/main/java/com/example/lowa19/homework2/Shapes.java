package com.example.lowa19.homework2;

import android.graphics.Paint;

/**
 * Created by lowa19 on 3/25/2017.
 */
public class Shapes {
    private Paint shapePaint;
    private String shapeName;
    public Shapes(String initName, Paint initPaint)
    {
        this.shapeName = initName;
        this.shapePaint = initPaint;
    }
    public String getName()
    {
        return this.shapeName;
    }
}
