package com.example.administrator.khonnkean;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class vdobun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdobun);

//        VideoView myVideoV = (VideoView)findViewById(R.id.videoView);
//        myVideoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bun));
//        myVideoV.setMediaController(new MediaController(this));
//        myVideoV.requestFocus();
//        myVideoV.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_vdobun, menu);
        return true;
    }
}
