package com.example.administrator.khonnkean;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by Administrator on 6/5/2558.
 */
public class SjActivity extends ActionBarActivity {
    attractionTABLE objAttractionTABLE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pla);

        objAttractionTABLE = new attractionTABLE(this);
        String[] attraction = objAttractionTABLE.Dataattractions(3);

        TextView nw = (TextView) findViewById(R.id.pla);
        nw.setText(attraction[1]);
    }
}
