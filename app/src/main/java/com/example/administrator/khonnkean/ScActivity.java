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
public class ScActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_five);
        ImageButton button18 = (ImageButton) findViewById(R.id.imageButton29);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScActivity.this, SupActivity.class);
                startActivity(intent);
                ImageButton button19 = (ImageButton) findViewById(R.id.imageButton30);
                button19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(ScActivity.this, SjActivity.class);
                        startActivity(intent);


                    }
                });


            }
        });
    }
}
