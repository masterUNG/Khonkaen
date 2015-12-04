package com.example.administrator.khonnkean;
import android.view.Menu;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class Map extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        GoogleMap mMap = ((SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map)).getMap();
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.408230, 102.833755), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.408230, 102.833755))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_YELLOW))
                .title("วัดหนองเเวงพระอารามหลวง")
                .snippet("Temple"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.413655, 102.838266), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.413655, 102.838266))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_BLUE))
                .title("บึงเเก่นนคร")
                .snippet("Park"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.419487, 102.839130), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.419487, 102.839130))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_RED))
                .title("โฮงมูนมังเมืองขอนเเก่น")
                .snippet("Museum"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.596137, 102.506212), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.596137, 102.506212))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_ROSE))
                .title("เขื่อนอุบลรัตน์")
                .snippet("Dam"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.678363, 102.267109), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.678363, 102.267109))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_ROSE))
                .title("พิพิธภัณฑ์ไดโนเสาร์ภูเวียง")
                .snippet("Museum"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.743777, 102.000490), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.743777, 102.000490))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_ROSE))
                .title("อุทยานเเห่งชาติภูผาม่าน")
                .snippet(" National Park"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.848188, 102.896449), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.848188, 102.896449))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_ROSE))
                .title("สวนสัตว์เขาสวนกวาง")
                .snippet("Zoo"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(15.803256, 102.608249), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(15.803256, 102.608249))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_ROSE))
                .title("หม่ำเมืองพล")
                .snippet("Store"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.060023, 102.727178), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.060023, 102.727178))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_ROSE))
                .title("กุนเชียงบ้านไผ่")
                .snippet("Store"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.088057, 102.631212), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.088057, 102.631212))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_ROSE))
                .title("ผ้าไหมเมืองชนบท")
                .snippet("Store"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.442552, 102.836124), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.442552, 102.836124))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_ROSE))
                .title("เทศกาลไหมเเละประเพณีผูกเสี่ยว")
                .snippet("Tradition"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.427063, 102.832202), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.427063, 102.832202))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_YELLOW))
                .title("เทศกาลดอกคูณเสียงเเคน")
                .snippet("Tradition"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(16.060469, 102.730315), 14));
        mMap.addMarker(new MarkerOptions().position(
                new LatLng(16.060469, 102.730315))
                .icon(BitmapDescriptorFactory.defaultMarker(
                        BitmapDescriptorFactory.HUE_YELLOW))
                .title("บุญกุ้มข้าวใหญ่")
                .snippet("Tradition"));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_map, menu);
        return super.onCreateOptionsMenu(menu);
    }





}
