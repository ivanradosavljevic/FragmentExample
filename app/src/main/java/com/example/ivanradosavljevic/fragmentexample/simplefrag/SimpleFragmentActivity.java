package com.example.ivanradosavljevic.fragmentexample.simplefrag;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ivanradosavljevic.fragmentexample.R;

public class SimpleFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_fragment);

        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceHolderFragment()).commit();
        }
    }

    public static class PlaceHolderFragment extends Fragment {

        public PlaceHolderFragment () {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_simple, container, false);

            return rootView;
        }
    }
}
