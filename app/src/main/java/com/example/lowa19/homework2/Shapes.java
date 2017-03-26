package com.example.lowa19.homework2;

import android.graphics.Canvas;
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

    public Paint getShapePaint() {return this.shapePaint;}

    public void setShapePaint(Paint paint)
    {
        this.shapePaint = paint;
    }

    public void drawShape(Canvas canvas)
    {
    }
    public Shapes getShape(int x, int y)
    {
        if(isSelected(x,y))
        {
            return this;
        }
        else
        {
            return null;
        }
    }
    public boolean isSelected(int x, int y)
    {
        return true;
    }
}
