package com.coba.ginanjar_1202150068_modul4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ListNama(View view){
        Intent i = new Intent(this, ListNama.class);
        startActivity(i);
    }
    public void ImageFinding(View view){
        Intent i = new Intent(this, ImageFinding.class);
        startActivity(i);
    }
}
