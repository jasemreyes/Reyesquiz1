package com.reyes.reyesquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class is extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is);

    }
    public void HomePage(View view) {
        Intent intenthome = new Intent(this, HomePage.class);
        startActivity(intenthome);
    }
    public void cs(View view) {
        Intent intentcs = new Intent(this, cs.class);
        startActivity(intentcs);
    }
    public void it(View view) {
        Intent intentit = new Intent(this, is.class);
        startActivity(intentit);
    }
    }

