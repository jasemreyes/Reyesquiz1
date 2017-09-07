package com.reyes.reyesquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class it extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

    }
    public void HomePage(View view) {
        Intent intenthome = new Intent(this, HomePage.class);
        startActivity(intenthome);
    }
    public void cs(View view) {
        Intent intentcs = new Intent(this, cs.class);
        startActivity(intentcs);
    }
    public void is(View view) {
        Intent intentis = new Intent(this, is.class);
        startActivity(intentis);
    }
}
