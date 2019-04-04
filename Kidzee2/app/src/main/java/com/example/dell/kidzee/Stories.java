package com.example.dell.kidzee;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Stories extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    ArrayList<String> alist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
        lv=(ListView)findViewById(R.id.view);
        alist=new ArrayList<String>();
        alist.add("A Rainy Day");
        alist.add("A Hungry Wolf");
        alist.add("The Sun & The Wind");
        alist.add("A Wise Old Owl");
        alist.add("Who Bell The Cat?");
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alist);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String name=alist.get(position);
        if(name.equals("A Rainy Day")){
            Intent i=new Intent(this,A_Rainy_Day.class);
            startActivity(i);
        }
        else if(name.equals("A Hungry Wolf")){
            Intent i=new Intent(this,A_Hungry_Wolf.class);
            startActivity(i);
        }

        else if(name.equals("The Sun & The Wind")){
            Intent i=new Intent(this,Sun_Wind.class);
            startActivity(i);
        }
        else if(name.equals("A Wise Old Owl")){
            Intent i=new Intent(this,Old_Owl.class);
            startActivity(i);
        }
        else if(name.equals("Who Bell The Cat?")){
            Intent i=new Intent(this,Cat.class);
            startActivity(i);
        }
    }
}
