package com.example.dell.kidzee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Vid extends AppCompatActivity {
    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid);
        vid = (VideoView)findViewById(R.id.vid);

        Intent i = getIntent();
        Vids v = (Vids)i.getSerializableExtra("str");
        int a = v.getId();

        String path="android.resource://"+getPackageName()+"/"+a;
        System.out.println(path);
        vid.setVideoPath(path);
        vid.setMediaController(new MediaController(this));
        vid.start();
    }
    /*public void stopVideo(View v){
        Intent i = new Intent(this, WatchStories.class);
        startActivity(i);
    }*/
}
