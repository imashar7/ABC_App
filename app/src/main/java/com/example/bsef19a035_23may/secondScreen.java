package com.example.bsef19a035_23may;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class secondScreen extends AppCompatActivity {

    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        a=findViewById(R.id.A);
        b=findViewById(R.id.B);
        c=findViewById(R.id.C);
        d=findViewById(R.id.D);
        e=findViewById(R.id.E);
        f=findViewById(R.id.F);
        g=findViewById(R.id.G);
        h=findViewById(R.id.H);
        i=findViewById(R.id.I);
        j=findViewById(R.id.J);
        k=findViewById(R.id.K);
        l=findViewById(R.id.L);
        m=findViewById(R.id.M);
        n=findViewById(R.id.N);
        o=findViewById(R.id.O);
        p=findViewById(R.id.P);
        q=findViewById(R.id.Q);
        r=findViewById(R.id.R);
        s=findViewById(R.id.S);
        t=findViewById(R.id.T);
        u=findViewById(R.id.U);
        v=findViewById(R.id.V);
        w=findViewById(R.id.W);
        x=findViewById(R.id.X);
        y=findViewById(R.id.Y);
        z=findViewById(R.id.Z);
    }

    public void onClick(View view) {
        Button bb=(Button)view;
        String btn=((Button) view).getText().toString();
        btn.toLowerCase();
        Log.d("click", "onClick:"+btn.toLowerCase());
        Intent intent=new Intent(secondScreen.this,images.class);
        intent.putExtra("key",btn.toLowerCase());
        startActivity(intent);
        //a.setText(btn);
        /*if(btn=="A"){
            Intent intent=new Intent(secondScreen.this,images.class);
            intent.putExtra("key","a");
            startActivity(intent);
        }
        else if(btn=="B"){
            Intent intent=new Intent(secondScreen.this,images.class);
            intent.putExtra("key","b");
            startActivity(intent);
        }*/

    }
}