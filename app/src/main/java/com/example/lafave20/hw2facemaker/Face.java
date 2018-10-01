package com.example.lafave20.hw2facemaker;

/*
@Author: Ben LaFave
Date: 10/1/18
CS 301
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.Random;

public class Face extends SurfaceView {

    protected int skinColor; //protected
    protected int eyeColor;
    protected int hairColor;
    protected int hairStyle;
    protected int radioNum;


    public Face(Context context, AttributeSet attrs) {

        super(context, attrs);
        setWillNotDraw(false);

        skinColor = Color.WHITE;
        eyeColor = Color.RED;
        hairColor = Color.BLUE;
    }


    public void setRadioNum( int selectedRadio)
    {
        radioNum = selectedRadio;
    }


    public void randomize()
    {
        /*

        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        Color randomColor = new Color(r, g, b);
        */

        /*External Resource Documentation
        https://stackoverflow.com/questions/4246351/creating-random-colour-in-java

         */

        //should change paint color to random


    }

    //@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onDraw(Canvas canvas)
    {
        Paint skinPaint = new Paint();
        skinPaint.setColor(skinColor);
        canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2,300, skinPaint); //draws skin on face


        Paint hairPaint = new Paint();
        hairPaint.setColor(hairColor);
        canvas.drawRect( 100, 100  , 100, 100 , hairPaint );
        //draws hair on face

        Paint eyePaint = new Paint();
        eyePaint.setColor(eyeColor);
        canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2,50, eyePaint);
        canvas.drawCircle(canvas.getWidth()/2 + 100,canvas.getHeight()/2,40, eyePaint);

        // +helper methods
    }


}
