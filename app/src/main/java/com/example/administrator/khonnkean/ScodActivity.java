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
public class ScodActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_three);
        ImageButton button14 = (ImageButton) findViewById(R.id.imageButton14);

        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton14);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TskmActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TskdkActivity.class);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SbActivity.class);
                startActivity(intent);

            }
        });
    }
}
