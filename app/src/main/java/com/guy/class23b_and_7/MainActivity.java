package com.guy.class23b_and_7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.Bundle;
import android.widget.ImageView;
import com.guy.class23b_and_7.PathImageGenerator.LatLng;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        32.044711192534926, 34.81335450750937
        32.046976452457535, 34.813845371639275
        32.049703935929394, 34.81400899301591
        32.051368123201996, 34.813572669344886
        32.05312473249017, 34.812318238790674
        32.05506620878662, 34.810082079976645
        32.05705386803069, 34.8051188982187
        32.05890281460601, 34.80397354858224
        32.059688605585094, 34.80397354858224
        32.06116772323511, 34.8051188982187
        32.05848680488454, 34.81270002200282
        32.059688605585094, 34.82104471221126
        32.05719254032002, 34.83309815362343
        32.05196907227955, 34.83767955216924
        32.05044357845347, 34.842042788879525

         */


        List<LatLng> latLngList = new ArrayList<>();
        latLngList.add(new LatLng(32.044711192534926, 34.81335450750937, 9f));
        latLngList.add(new LatLng(32.046976452457535, 34.813845371639275, 12f));
        latLngList.add(new LatLng(32.049703935929394, 34.81400899301591, 22f));
        latLngList.add(new LatLng(32.051368123201996, 34.813572669344886, 44f));
        latLngList.add(new LatLng(32.05312473249017, 34.812318238790674, 70f));
        latLngList.add(new LatLng(32.05506620878662, 34.810082079976645, 40f));
        latLngList.add(new LatLng(32.05705386803069, 34.8051188982187, 20f));
        latLngList.add(new LatLng(32.05890281460601, 34.80397354858224, 80f));
        latLngList.add(new LatLng(32.059688605585094, 34.80397354858224, 100f));
        latLngList.add(new LatLng(32.06116772323511, 34.8051188982187, 110f));
        latLngList.add(new LatLng(32.05848680488454, 34.81270002200282, 120f));
        latLngList.add(new LatLng(32.059688605585094, 34.82104471221126, 130f));
        latLngList.add(new LatLng(32.05719254032002, 34.83309815362343, 120f));
        latLngList.add(new LatLng(32.05196907227955, 34.83767955216924, 90f));
        latLngList.add(new LatLng(32.05044357845347, 34.842042788879525, 70f));

        Bitmap bitmap = PathImageGenerator.generatePath(latLngList);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageBitmap(bitmap);
    }
}