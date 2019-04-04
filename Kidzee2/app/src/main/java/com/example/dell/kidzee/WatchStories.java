package com.example.dell.kidzee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class WatchStories extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView stories;
    ArrayList<Vids> strlist=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_stories);
        stories = (ListView)findViewById(R.id.stories);
        stories.setOnItemClickListener(this);
        strlist = new ArrayList<Vids>();
        strlist.add(new Vids(R.raw.magicpot,"Magic Pot" ));
        strlist.add(new Vids(R.raw.runaway,"Runaway"));
        strlist.add(new Vids(R.raw.anelephantandatailor,"An Elephant and a Tailor"));
        strlist.add(new Vids(R.raw.thehorseandthesnail,"The Horse and the Snail"));
        strlist.add(new Vids(R.raw.thethirstycrow,"The Thirsty Crow"));
        ArrayAdapter<Vids> ad = new ArrayAdapter<Vids>(this,android.R.layout.simple_list_item_1,strlist);
        stories.setAdapter(ad);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Vids v = strlist.get(position);
        Intent i = new Intent(this,Vid.class);
        i.putExtra("str",v);
        startActivity(i);

        }
    }


