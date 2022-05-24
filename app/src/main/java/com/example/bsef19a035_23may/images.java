package com.example.bsef19a035_23may;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class images extends AppCompatActivity {

    TextView t;
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        i=findViewById(R.id.img);
        //t=findViewById(R.id.txt);
        Intent intent=getIntent();
        String a=intent.getStringExtra("key");
        int ii=getResources().getIdentifier("com.example.bsef19a035_23may:drawable/"+a,null,null);
        i.setImageResource(ii);
    }
}