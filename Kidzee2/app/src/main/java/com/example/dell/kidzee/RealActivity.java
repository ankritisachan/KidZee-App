package com.example.dell.kidzee;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RealActivity extends AppCompatActivity {
    EditText edt;
    SharedPreferences sp=null;
    SharedPreferences.Editor spe=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);
        edt=(EditText)findViewById(R.id.name);

        sp=getSharedPreferences("kidinfo",MODE_PRIVATE);
        spe=sp.edit();
    }
    public void jump(View v){
        String nm=edt.getText().toString();
        spe.putString("name",nm);
        spe.commit();
        Toast.makeText(this,nm,Toast.LENGTH_LONG).show();
        Intent i=new Intent(this,Selection.class);

        startActivity(i);
        finish();
    }

}
