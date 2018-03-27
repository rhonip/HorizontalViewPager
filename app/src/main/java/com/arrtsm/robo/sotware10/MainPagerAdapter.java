package com.arrtsm.robo.sotware10;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainPagerAdapter extends FragmentStatePagerAdapter {

    private final static int COUNT = 3;

    private final static int HORIZONTAL = 0;
    private final static int TWO_WAY = 1;
    private LayoutInflater mLayoutInflater;


    public MainPagerAdapter(final FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(final int position) {
        //View view;


       /* switch (position) {
            case TWO_WAY:
                return new TwoWayPagerFragment();
            case HORIZONTAL:
            default:*/
      if(position==0)
       {
           Log.i("value1", "position 0: " +position);
       }
        if(position==1)
        {
            Log.i("value", "position 2: " +position);
        }

                return new HorizontalPagerFragment();
       // }
    }

    @Override
    public int getCount() {
        return COUNT;
    }


}
