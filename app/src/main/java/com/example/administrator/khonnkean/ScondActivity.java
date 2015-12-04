package com.example.administrator.khonnkean;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Administrator on 4/5/2558.
 */
public class ScondActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_two);


        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton7);
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton button8 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton button6 = (ImageButton) findViewById(R.id.imageButton11);
        ImageButton button7 = (ImageButton) findViewById(R.id.imageButton12);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SvActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BknkActivity.class);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HmmActivity.class);
                startActivity(intent);



            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UbrActivity.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PptpActivity.class);
                startActivity(intent);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UtyActivity.class);
                startActivity(intent);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SunsActivity.class);
                startActivity(intent);

            }
        });
    }
}


























