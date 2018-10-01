package com.example.lafave20.hw2facemaker;

/*
@Author: Ben LaFave
Date: 10/1/18
CS 301
 */

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    // Face myFace = (Face)findViewById(R.id.faceDisplay);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner hairSpinner = (Spinner) findViewById(R.id.hairSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hair, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hairSpinner.setAdapter(adapter);
        //hairSpinner.setOnItemSelectedListener(this);

        /*      External Resource Documentation
        implemented spinner and array of hair types with this YouTube Video:
        https://www.youtube.com/watch?v=on_OrrX7Nw4
        9/30/18
         */


        /*This code connects my interFACE (haha get it?) of Seekbars,
        radios to the listeners so that these tools can be used in code.
        And when they are changed the colors will be changed accordingly
        */

        /*
        ActionListener faceListener = new ActionListener( myFace );

        SeekBar redSB = (SeekBar)findViewById(R.id.redBar);
        SeekBar greenSB = (SeekBar)findViewById(R.id.greenBar);
        SeekBar blueSB = (SeekBar)findViewById(R.id.blueBar);

        RadioButton hairRB = (RadioButton)findViewById(R.id.hairButton);
        RadioButton eyesRB = (RadioButton)findViewById(R.id.eyesButton);
        RadioButton skinRB = (RadioButton)findViewById(R.id.skinButton);

        redSB.setOnSeekBarChangeListener( faceListener );
        greenSB.setOnSeekBarChangeListener( faceListener);
        blueSB.setOnSeekBarChangeListener( faceListener);

        hairRB.setOnCheckedChangeListener( faceListener );
        eyesRB.setOnCheckedChangeListener( faceListener );
        skinRB.setOnCheckedChangeListener( faceListener );

        //connects random face button with listener
        Button randomButton = (Button)findViewById(R.id.randFaceButton);
        randomButton.setOnClickListener( faceListener );
        */

        //Was not able to debug this part of my code... :(









    }









    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //String text = parent.getItemAtPosition(position.toString);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
