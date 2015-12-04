package com.example.administrator.khonnkean;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Mum extends AppCompatActivity {
    attractionTABLE objAttractionTABLE;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mum);

            objAttractionTABLE = new attractionTABLE(this);
            String[] attraction = objAttractionTABLE.Dataattractions(4);

            TextView nw = (TextView) findViewById(R.id.m);
            nw.setText(attraction[0]);

        }
    }

