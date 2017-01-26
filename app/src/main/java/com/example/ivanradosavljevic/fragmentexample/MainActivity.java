package com.example.ivanradosavljevic.fragmentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ivanradosavljevic.fragmentexample.fragmentviewpager.ViewPagerActivity;
import com.example.ivanradosavljevic.fragmentexample.multifrag.MultiFragActivity;
import com.example.ivanradosavljevic.fragmentexample.simplefrag.SimpleFragmentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simple(View v) {

        Intent intent = new Intent(getApplicationContext(), SimpleFragmentActivity.class);
        startActivity(intent);
    }

    public void multi(View v) {

        Intent intent = new Intent(getApplicationContext(), MultiFragActivity.class);
        startActivity(intent);
    }
    public void pager(View v) {
        Intent intent = new Intent(getApplicationContext(), ViewPagerActivity.class);
        startActivity(intent);
    }

    public void draw(View v){

    }
}
