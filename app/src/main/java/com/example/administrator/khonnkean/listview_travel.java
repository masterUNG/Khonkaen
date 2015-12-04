package com.example.administrator.khonnkean;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;



@SuppressLint("NewApi")
public class listview_travel extends ActionBarActivity {
    private String[] temp;
    private ListView listview;
    private ArrayList<String> arraylist = new ArrayList<String>();
    private ArrayAdapter<String> adapter;
    private EditText edittext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_travel);


        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        listview = (ListView) findViewById(R.id.listView);
        edittext1 = (EditText) findViewById(R.id.EditText01);

        temp = getHTML("http://10.71.20.46/attraction/select_all.php").split("/");
        System.out.println(temp[0]);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arraylist);

        if (temp.length < 1) {
            System.out.println("temp = null" + temp.length);
            Toast.makeText(getApplicationContext(), "ไม่มีข้อมูล", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            System.out.println("temp = not null" + temp.length);
            for (int i = 0; i < temp.length; i++) {
                arraylist.add(temp[i]);
            }
        }

        listview.setAdapter(adapter);
        listview.setBackgroundColor(Color.WHITE);


        edittext1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                listview_travel.this.adapter.getFilter().filter(s);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });

        listview.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                // TODO Auto-generated method stub
                String item = arg0.getAdapter().getItem(arg2).toString();
                Toast.makeText(getApplicationContext(), "" + item, Toast.LENGTH_SHORT).show();
                // intent
                Intent i = new Intent(getApplicationContext(), show_travel.class);
                i.putExtra("item", item);
                startActivity(i);
            }
        });

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


}