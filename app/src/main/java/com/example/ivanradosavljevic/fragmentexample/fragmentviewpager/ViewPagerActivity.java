package com.example.ivanradosavljevic.fragmentexample.fragmentviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ivanradosavljevic.fragmentexample.R;

public class ViewPagerActivity extends AppCompatActivity {

    /*
    Activity for pager. Here we use pager to create a image slider.
     */

    ViewPager pager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this layout is without layout. Here we define pager for sliding images.
        setContentView(R.layout.activity_view_pager);
        //define pager and adapter
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
    }
}
