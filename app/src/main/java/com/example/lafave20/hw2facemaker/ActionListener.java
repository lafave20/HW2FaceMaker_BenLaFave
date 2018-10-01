package com.example.lafave20.hw2facemaker;

/*
@Author: Ben LaFave
Date: 10/1/18
CS 301
 */

import android.graphics.Color;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.SeekBar;

import java.util.Random;

public class ActionListener implements SeekBar.OnSeekBarChangeListener, View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    //on click listener for random button
    //radio listener for radio buttons
    //seek bar listener for 3 color changer seekbars

    int checkedRadio;
    public Face faceView;

    public ActionListener ( Face face )
    {
        faceView = face;
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        //if statement to choose between one of three Seekbars
        if( seekBar.getId() == R.id.redBar )
        {
            //change red in RGB in Face


        }
        if( seekBar.getId() == R.id.greenBar )
        {
            //change green in RGB in Face


        }
        if( seekBar.getId() == R.id.blueBar )
        {
            //change blue in RGB in Face


        }


    }
    //not needed / used
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }
    //not needed/ used
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    //for random button
    @Override
    public void onClick(View v) {
        /*External Resource Documentation
        https://www.youtube.com/watch?v=BMXNEVu6U2E
        */
        //this should trigger randomize and create a face (skin, eyes, and hair) each with random colors
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));


    }



    //radio listener
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if( checkedId == R.id.hairButton ) { faceView.setRadioNum(1); }    //sends which radio is checked to face so it knows what to draw
        if( checkedId == R.id.eyesButton ) { faceView.setRadioNum(2); }    //sends which radio is checked to face so it knows what to draw
        if( checkedId == R.id.skinButton ) { faceView.setRadioNum(3); }    //sends which radio is checked to face so it knows what to draw


    }

}
