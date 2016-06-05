package com.droidhunters.master.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร หน่วยความจำของ memory
    private ListView trafficListView;
    private Button aboutMeButton;
    private String urlYoutubeString = "https://youtu.be/c91bNchSC5Q";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bind Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //controlerButton
        controllerButton();

        //Controller Listview
        controllerListView();


    }//Method หรือ เมดธอดหลัก

    private void controllerListView() {
        //Setup for Name
        final String[] nameStrings = new String[20];
        nameStrings[0] = "หัวข้อที่ 1";
        nameStrings[1] = "หัวข้อที่ 2";
        nameStrings[2] = "หัวข้อที่ 3";
        nameStrings[3] = "หัวข้อที่ 4";
        nameStrings[4] = "หัวข้อที่ 5";
        nameStrings[5] = "หัวข้อที่ 6";
        nameStrings[6] = "หัวข้อที่ 7";
        nameStrings[7] = "หัวข้อที่ 8";
        nameStrings[8] = "หัวข้อที่ 9";
        nameStrings[9] = "หัวข้อที่ 10";
        nameStrings[10] = "หัวข้อที่ 11";
        nameStrings[11] = "หัวข้อที่ 12";
        nameStrings[12] = "หัวข้อที่ 13";
        nameStrings[13] = "หัวข้อที่ 14";
        nameStrings[14] = "หัวข้อที่ 15";
        nameStrings[15] = "หัวข้อที่ 16";
        nameStrings[16] = "หัวข้อที่ 17";
        nameStrings[17] = "หัวข้อที่ 18";
        nameStrings[18] = "หัวข้อที่ 19";
        nameStrings[19] = "หัวข้อที่ 20";

        //For Detail Short
        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        //For image
        MyData myData = new MyData();
        final int[] ints = myData.getInts();

        //Create Listview
        MyAdapter myAdapter = new MyAdapter(this, ints, nameStrings, detailStrings);
        trafficListView.setAdapter(myAdapter);

       trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


               Intent intent = new Intent(MainActivity.this, DetailActivity.class); //new เสร็จ ctrl+space
               intent.putExtra("Name", nameStrings[position]);
               intent.putExtra("Image", ints[position]);
               intent.putExtra("Index", position);
               startActivity(intent);

           }
       });

    }

    private void controllerButton() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // sound effect การใส่เสียง
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.lion);
                mediaPlayer.start();


                //webView
                Intent inten = new Intent(Intent.ACTION_VIEW);
                inten.setData(Uri.parse(urlYoutubeString));

                startActivity(inten);

            } //ประกาศ new เพื่อดึง method มาใช้งาน





        });






} //controllButton

} //Main Class คลาสหลัก

