package com.example.ivanradosavljevic.fragmentexample.fragmentviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ivanradosavljevic.fragmentexample.R;

/**
 * Created by Ivan Radosavljevic on 17.1.2017.
 */
public class MyViewPagerFragment extends Fragment {

    /*
    Here we have one fragment, which contains image slider.
     */

    public MyViewPagerFragment() {

    }

    public static MyViewPagerFragment newInstance(int position, int imageID) {
        MyViewPagerFragment myFrag = new MyViewPagerFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("imagePosition", position);
        bundle.putInt("imageID", imageID);
        myFrag.setArguments(bundle);
        return myFrag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_pager, container, false);

        int imageId = getArguments().getInt("imageID");
        int position = getArguments().getInt("imagePosition");
        ImageView iv = (ImageView) rootView.findViewById(R.id.ivViewPager);
        iv.setImageResource(imageId);

        Toast.makeText(getActivity(), "Page number " + position, Toast.LENGTH_SHORT).show();

        return rootView;
    }
}
