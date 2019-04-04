package com.example.dell.kidzee;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ListenPoems extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    Button stop;
    RadioGroup rdgr;
    RadioButton rb;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_poems);
        rdgr = (RadioGroup) findViewById(R.id.rdgr);
        stop = (Button) findViewById(R.id.stop);
        rdgr.setOnCheckedChangeListener(this);
        mp = MediaPlayer.create(this, R.raw.humpty);
    }

    public void stop(View v){
        mp.stop();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        rb = (RadioButton) findViewById(checkedId);
        switch (rb.getId()) {
            case R.id.hd:
                mp.reset();
                mp = MediaPlayer.create(this, R.raw.humpty);
                mp.start();
                break;
            case R.id.jaji:
                mp.reset();
                mp = MediaPlayer.create(this, R.raw.jack);
                mp.start();
                break;
            case R.id.jojo:
                mp.reset();
                mp = MediaPlayer.create(this, R.raw.johny);
                mp.start();
                break;
            case R.id.bb:
                mp.reset();
                mp = MediaPlayer.create(this, R.raw.sheep);
                mp.start();
                break;
            case R.id.tt:
                mp.reset();
                mp = MediaPlayer.create(this, R.raw.twinkle);
                mp.start();
                break;

        }
    }
}
