package com.example.administrator.khonnkean;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by BUM on 9/14/2015.
 */
public class BknkActivity extends ActionBarActivity {
    attractionTABLE objAttractionTABLE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_bkn);

        objAttractionTABLE = new attractionTABLE(this);

        String[] attraction = objAttractionTABLE.Dataattractions(1);

        TextView nw = (TextView) findViewById(R.id.bkk);
        nw.setText(attraction[1]);

        Button jw = (Button) findViewById(R.id.s);
        jw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BknkActivity.this, im_bang.class);
                startActivity(intent);
            }
        });
    }
}



