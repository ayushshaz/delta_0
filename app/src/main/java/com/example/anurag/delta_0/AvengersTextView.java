package com.example.anurag.delta_0;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Anurag on 6/6/2018.
 */

public class AvengersTextView extends TextView{

    public AvengersTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Typeface type = Typeface.createFromAsset(context.getAssets(),"avengers_font.ttf");
        setTypeface(type);
    }
}
