package com.droidhunters.master.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

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

    }//Method หรือ เมดธอดหลัก

    private void controllerButton() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sound effect การใส่เสียง
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.lion);
                mediaPlayer.start();
            } //ประกาศ new เพื่อดึง method มาใช้งาน
        });

        //webView
        Intent inten = new Intent(Intent.ACTION_VIEW);
        inten.setData(Uri.parse(urlYoutubeString));

    } //controllButton

} //Main Class คลาสหลัก

