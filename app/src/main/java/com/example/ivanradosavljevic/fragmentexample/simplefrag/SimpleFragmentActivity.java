package com.example.ivanradosavljevic.fragmentexample.simplefrag;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ivanradosavljevic.fragmentexample.R;
/*
Opens single image
 */
public class SimpleFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //calling xml layout for main activity
        setContentView(R.layout.activity_simple_fragment);

        //calling xml layout's id where fragment would be created and creating placeholder for holding fragment's xml layout
        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceHolderFragment()).commit();
        }
    }

    /*
    For this example, PlaceHolder is static class nested within main activity
     */
    public static class PlaceHolderFragment extends Fragment {

        public PlaceHolderFragment () {

        }

        @Override
        // calling xml layout for fragment
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_simple, container, false);

            return rootView;
        }
    }
}
