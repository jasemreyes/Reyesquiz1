package com.reyes.reyesquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cs extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);


    }
    public void HomePage(View view) {
        Intent intenthome = new Intent(this, HomePage.class);
        startActivity(intenthome);
    }
    public void it(View view) {
        Intent intentit = new Intent(this, it.class);
        startActivity(intentit);
    }
    public void is(View view) {
        Intent intentis = new Intent(this, is.class);
        startActivity(intentis);
    }
}
