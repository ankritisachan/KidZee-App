package com.example.dell.kidzee;

import android.annotation.SuppressLint;
import android.opengl.EGLExt;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;


public class LearnAlphabets extends AppCompatActivity implements AdapterView.OnItemClickListener,TextToSpeech.OnInitListener
{
    ListView alpha;
    ArrayList<Character> alphalist=null;
    char x = 'A';
    TextToSpeech tts = null;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_alphabets);
        alpha = (ListView)findViewById(R.id.alpha);
        alpha.setOnItemClickListener(this);
        alphalist = new ArrayList<Character>();
        for(int i =0;i<26;i++){
            alphalist.add(x);
            x++;
        }
        ArrayAdapter<Character> ad = new ArrayAdapter<Character>(this,android.R.layout.simple_list_item_1,alphalist);
        alpha.setAdapter(ad);
        tts = new TextToSpeech(this,this);

    }

    /*@SuppressLint("NewApi")z
    @Override
    protected void onStart() {
        super.onStart();
        tts.speak("Hello Kid.",TextToSpeech.QUEUE_FLUSH,null,null);
    }*/

    @SuppressLint("NewApi")
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String a = alphalist.get(position).toString();
        //Toast.makeText(this,"Click", Toast.LENGTH_SHORT).show();
        tts.speak(a,TextToSpeech.QUEUE_FLUSH,null);

    }

    @Override
    public void onInit(int status) {
        if(status==TextToSpeech.LANG_NOT_SUPPORTED||status==TextToSpeech.LANG_MISSING_DATA)
            Toast.makeText(this,"notsupported"+status,Toast.LENGTH_LONG).show();
        else
            tts.setLanguage(Locale.UK);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tts.shutdown();
    }
}
