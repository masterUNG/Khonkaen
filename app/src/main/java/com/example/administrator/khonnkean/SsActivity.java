package com.example.administrator.khonnkean;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by Administrator on 5/5/2558.
 */
public class SsActivity extends ActionBarActivity {

    attractionTABLE objAttractionTABLE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_silk);

        objAttractionTABLE = new attractionTABLE(this);
        String[] attraction = objAttractionTABLE.Dataattractions(4);

        TextView nw = (TextView) findViewById(R.id.s);
        nw.setText(attraction[2]);

    }
}


