package com.example.ivanradosavljevic.fragmentexample.multifrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ivanradosavljevic.fragmentexample.R;

/**
 * Created by Ivan Radosavljevic on 17.1.2017.
 */
public class KoalaFragment extends Fragment {

    public KoalaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_multi_koala, null);
        return rootView;
    }
}
