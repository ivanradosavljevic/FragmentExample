package com.example.ivanradosavljevic.fragmentexample.multifrag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ivanradosavljevic.fragmentexample.R;
/*
Multifragment main activity. Here, we don't have static PlaceHolder class. Instead, we have separate class called MenuFragment
 */

public class MultiFragActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // calling xml layout for multifragment main activity. This xml has two framelayouts because we have two fragments in main activity
        //First frame is defined here, because it is staitc (menu), and other one is defined in MenuFragment class
        setContentView(R.layout.activity_multi_frag);

        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    //no static placeholder class! Define menu container
                    .add(R.id.menuContainer, new MenuFragment()).commit();
        }
    }
}
