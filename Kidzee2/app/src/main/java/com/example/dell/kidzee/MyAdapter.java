package com.example.dell.kidzee;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DELL on 19-07-2016.
 */
public class MyAdapter extends BaseAdapter {

    private final ArrayList<Category> ml;

    private LayoutInflater lf=null;
    Context ctx=null;
    public MyAdapter(Activity activity, ArrayList<Category>l)
    {
        ctx= activity.getApplicationContext();
        ml=l;
        lf=LayoutInflater.from(activity);
    }
    @Override
    public int getCount() {
        return ml.size();
    }

    @Override
    public Object getItem(int position) {
        return ml.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Toast.makeText(ctx,"view created", Toast.LENGTH_LONG).show();
        if(convertView==null) {
            convertView = lf.inflate(R.layout.mycustom, parent, false);
        }
        TextView tv=(TextView)convertView.findViewById(R.id.tv);
        ImageView im=(ImageView)convertView.findViewById(R.id.img) ;
        Category f=ml.get(position);
        tv.setText(f.getName());
        im.setImageBitmap(f.getFruitimg());
        return convertView;
    }
}

