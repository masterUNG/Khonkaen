package com.example.administrator.khonnkean;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by BUM on 9/15/2015.
 */
public class TskmActivity extends ActionBarActivity {
    attractionTABLE objAttractionTABLE;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tskm);

        objAttractionTABLE = new attractionTABLE(this);
        String[] attraction = objAttractionTABLE.Dataattractions(2);

        TextView nw = (TextView) findViewById(R.id.ps);
        nw.setText(attraction[1]);
    }

}
