package com.example.administrator.khonnkean;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by Administrator on 5/5/2558.
 */
public class SbActivity extends ActionBarActivity {
    attractionTABLE objAttractionTABLE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_bun);
        objAttractionTABLE = new attractionTABLE(this);
        String[] attraction = objAttractionTABLE.Dataattractions(2);

        TextView nw = (TextView) findViewById(R.id.bk);
        nw.setText(attraction[0]);


    }
}
