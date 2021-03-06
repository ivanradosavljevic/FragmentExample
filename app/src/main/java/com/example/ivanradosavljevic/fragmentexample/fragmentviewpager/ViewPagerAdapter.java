package com.example.ivanradosavljevic.fragmentexample.fragmentviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.ivanradosavljevic.fragmentexample.R;

/**
 * Created by Ivan Radosavljevic on 17.1.2017.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    /*
    This class defines images and its positions
     */

    int[] images = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six};

    //Constructor grabs fragmetn manager
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        //here we are sending every time new image
        return MyViewPagerFragment.newInstance(position,images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }
}
