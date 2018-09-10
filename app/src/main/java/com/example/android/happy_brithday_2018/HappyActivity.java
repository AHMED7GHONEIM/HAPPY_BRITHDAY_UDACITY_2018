package com.example.android.happy_brithday_2018;

import android.graphics.Typeface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HappyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);


        TextView f = (TextView)findViewById(R.id.txt1);
        TextView s = (TextView)findViewById(R.id.txt2);
        TextView q = (TextView)findViewById(R.id.txt3);

        f.setTypeface(Typeface.createFromAsset(getAssets(),"ar.ttf"));
        s.setTypeface(Typeface.createFromAsset(getAssets(),"ar.ttf"));
        q.setTypeface(Typeface.createFromAsset(getAssets(),"ar.ttf"));







    }
}
