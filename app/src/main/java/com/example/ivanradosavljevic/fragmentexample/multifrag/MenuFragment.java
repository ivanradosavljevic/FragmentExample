package com.example.ivanradosavljevic.fragmentexample.multifrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ivanradosavljevic.fragmentexample.R;

/**
 * Created by Ivan Radosavljevic on 17.1.2017.
 */
public class MenuFragment extends Fragment {

    Fragment frag;
    FragmentTransaction fragTransaction;


    public MenuFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.menu_multi, container, false);

        frag = new KoalaFragment();
        fragTransaction = getFragmentManager().beginTransaction().add(R.id.multicontainer, frag);
        fragTransaction.commit();
        Button btnKoala = (Button) rootView.findViewById(R.id.btnKoala);
        Button btnPenguin = (Button) rootView.findViewById(R.id.btnPenguin);
        Button btnOther  = (Button) rootView.findViewById(R.id.btnOther);

        btnKoala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag = new KoalaFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.multicontainer,frag);
                fragTransaction.commit();
            }
        });

        btnPenguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag = new PenguinFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.multicontainer,frag);
                fragTransaction.commit();

            }
        });

        btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag = new OtherFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.multicontainer,frag);
                fragTransaction.commit();
            }
        });
        return rootView;
    }
}
