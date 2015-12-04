package com.example.administrator.khonnkean;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 5/5/2558.
 */
public class SupActivity extends ActionBarActivity{
    attractionTABLE objAttractionTABLE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sup);

        objAttractionTABLE = new attractionTABLE(this);
        String[] attraction = objAttractionTABLE.Dataattractions(3);

        TextView nw = (TextView) findViewById(R.id.sup);
        nw.setText(attraction[0]);

        Button aw = (Button) findViewById(R.id.sap);
        aw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SupActivity.this, supp.class);
                startActivity(intent);
            }
        });
    }
}
