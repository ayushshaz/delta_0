package com.example.anurag.delta_0;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Anurag on 6/6/2018.
 */

public class AvengersButton extends Button{

    public AvengersButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface type = Typeface.createFromAsset(context.getAssets(),"avengers_font.ttf");
        setTypeface(type);
    }
}
