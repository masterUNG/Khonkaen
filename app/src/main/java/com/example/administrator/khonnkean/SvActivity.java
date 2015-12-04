package com.example.administrator.khonnkean;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Administrator on 5/5/2558.
 */
public class SvActivity extends ActionBarActivity {

    attractionTABLE objAttractionTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_wat);




        objAttractionTABLE = new attractionTABLE(this);
        String[] attraction = objAttractionTABLE.Dataattractions(1);

        TextView nw = (TextView) findViewById(R.id.nw);
        nw.setText(attraction[0]);

        Button w = (Button) findViewById(R.id.wat);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SvActivity.this, im_wat.class);
                startActivity(intent);
            }
        });
    }
}






