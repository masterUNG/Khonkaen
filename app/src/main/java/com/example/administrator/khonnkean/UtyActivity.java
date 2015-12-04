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
public class UtyActivity extends ActionBarActivity {
    attractionTABLE objAttractionTABLE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_utyp);

        objAttractionTABLE = new attractionTABLE(this);
        String[] attraction = objAttractionTABLE.Dataattractions(1);

        TextView nw = (TextView) findViewById(R.id.ut);
        nw.setText(attraction[5]);

        Button vw = (Button) findViewById(R.id.uty);
        vw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UtyActivity.this, im_uu.class);
                startActivity(intent);
            }
        });

    }

}

