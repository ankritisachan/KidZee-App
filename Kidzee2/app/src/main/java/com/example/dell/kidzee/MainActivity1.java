package com.example.dell.kidzee;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    TextView tv;
    SharedPreferences sp=null;
    SharedPreferences.Editor spe=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        tv=(TextView)findViewById(R.id.txt);
        Animation a= AnimationUtils.loadAnimation(this,R.anim.kidanim);
        tv.startAnimation(a);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                    sp=getSharedPreferences("kidinfo",MODE_PRIVATE);
                    String name=sp.getString("name","null");
                    if(!name.equals("null")){
                        Intent i=new Intent(MainActivity1.this,Selection.class);

                        startActivity(i);
                        finish();
                    }else{
                        Intent i=new Intent(MainActivity1.this,RealActivity.class);
                        startActivity(i);
                    finish();}

                }
                catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        }).start();
    }
}
