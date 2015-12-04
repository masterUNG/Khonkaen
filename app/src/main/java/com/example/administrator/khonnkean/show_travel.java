package com.example.administrator.khonnkean;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;


public class show_travel extends ActionBarActivity {
    private TextView key_name, key_detail;
    private String id_shop;
    private ImageView im;
    //private String temp[];
    private ArrayList<String> arraylist = new ArrayList<String>();
    private ArrayAdapter<String> adapter;
    private String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_travel);


        String a = getIntent().getStringExtra("item");

        key_name = (TextView) findViewById(R.id.keyword);
        key_name.setText(a);


        setIm((ImageView) findViewById(R.id.imageView1));


        String[] temp = getHTML("http://10.71.20.46/attraction/select_all_show.php?name="+ a).split("<>");
        //adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arraylist);

        System.out.println("temp = not null" + temp.length);
        for (int i = 0; i < temp.length; i++) {
            arraylist.add(temp[i]);
            System.out.println(temp[0]);
        }

//        String location_detail = temp[0],
//        	   location_pic = temp[1];
        key_detail = (TextView) findViewById(R.id.key_detail1);
        key_detail.setText(temp[1]);

        System.out.println(temp[1]);

        String imagename = temp[2];
        int resID = getResources().getIdentifier(imagename, "drawable", getPackageName());
        System.out.println("TEST" + resID);
        ImageView b = (ImageView) findViewById(R.id.imageView1);
        Drawable bb = getResources().getDrawable(resID);
        b.setImageDrawable(bb);

    }


    public String getHTML(String url) {
        try {
            HttpClient httpClient = new DefaultHttpClient();
            HttpGet request = new HttpGet(url);
            HttpResponse response = httpClient.execute(request);
            String result = EntityUtils.toString(response.getEntity(), HTTP.UTF_8);
            return result;
        } catch (Exception e) {
            //	throw new RuntimeException("error : "+e);
            Log.e("log_tag", "Error in http connection " + e.toString());
        }
        return null;
    }

    public ImageView getIm() {
        return im;
    }

    public void setIm(ImageView im) {
        this.im = im;
    }

    public ArrayAdapter<String> getAdapter() {
        return adapter;
    }

    public void setAdapter(ArrayAdapter<String> adapter) {
        this.adapter = adapter;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}