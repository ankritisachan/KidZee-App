package com.example.dell.kidzee;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Selection extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    ArrayList<Category>categorylist=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        categorylist = new ArrayList<Category>();

        lv = (ListView)findViewById(R.id.lv);
        categorylist.add(new Category("Watch Stories", BitmapFactory.decodeResource(getResources(),R.drawable.vid)));
        categorylist.add(new Category("Listen Poems",BitmapFactory.decodeResource(getResources(),R.drawable.aud)));
        categorylist.add(new Category("Read Stories",BitmapFactory.decodeResource(getResources(),R.drawable.read)));
        categorylist.add(new Category("Learn Alphabets",BitmapFactory.decodeResource(getResources(),R.drawable.alp)));
        MyAdapter ad=new MyAdapter(this,categorylist);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Category c = categorylist.get(position);
        String s = c.getName();
        switch (s){
            case("Watch Stories"):
                Intent i = new Intent(this,WatchStories.class);
                startActivity(i);
                break;
            case("Listen Poems"):
                Intent j = new Intent(this,ListenPoems.class);
                startActivity(j);
                break;
            case("Read Stories"):
                Intent k = new Intent(this,Stories.class);
                startActivity(k);
                break;
            case("Learn Alphabets"):
                Intent l = new Intent(this,LearnAlphabets.class);
                startActivity(l);
                break;
        }
    }
}
