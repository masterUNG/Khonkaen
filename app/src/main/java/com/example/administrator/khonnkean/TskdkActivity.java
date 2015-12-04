package com.example.administrator.khonnkean;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by BUM on 9/15/2015.
 */
public class TskdkActivity extends ActionBarActivity {

    attractionTABLE objAttractionTABLE;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tskdk);

        objAttractionTABLE = new attractionTABLE(this);
        String[] attraction = objAttractionTABLE.Dataattractions(2);

        TextView nw = (TextView) findViewById(R.id.d);
        nw.setText(attraction[2]);
    }


}
