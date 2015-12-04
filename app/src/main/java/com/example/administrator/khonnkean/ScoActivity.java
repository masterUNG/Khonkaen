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
public class ScoActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_four);
        ImageButton button17 = (ImageButton) findViewById(R.id.imageButton25);
        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton25);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton26);
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton27);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Mum .class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Kun.class);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SsActivity.class);
                startActivity(intent);

            }
        });
    }
}
