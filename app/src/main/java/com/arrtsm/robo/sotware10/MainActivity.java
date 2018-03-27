package com.arrtsm.robo.sotware10;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.vp_main);
        //viewPager.setBackgroundColor(Color.BLACK);
        viewPager.setAdapter(new MainPagerAdapter(getSupportFragmentManager()));
        /*viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            // This method will be invoked when a new page becomes selected.
            @Override
            public void onPageSelected(int position) {
                if(position==1)
                {

                    Log.e("value8", "onPageSelected: ");

                }

                //horizontalInfiniteCycleViewPager.setBackgroundColor(Color.BLACK);

               *//* Toast.makeText(MainActivity.this,"Selected page position: " + position, Toast.LENGTH_SHORT).show();*//*
            }

            // This method will be invoked when the current page is scrolled
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // Code goes here

            }

            // Called when the scroll state changes:
            // SCROLL_STATE_IDLE, SCROLL_STATE_DRAGGING, SCROLL_STATE_SETTLING
            @Override
            public void onPageScrollStateChanged(int state) {
                // Code goes here
                if(state==1){
                    //horizontalInfiniteCycleViewPager.setBackgroundColor(Color.BLACK);
                }
            }
        });*/

        //viewPager.setOffscreenPageLimit(1);

        /*final NavigationTabStrip navigationTabStrip = (NavigationTabStrip) findViewById(R.id.nts);
        navigationTabStrip.setTitles("HOW WE WORK", "WE WORK WITH");
        navigationTabStrip.setViewPager(viewPager);*/
        //viewPager.setBackgroundColor(Color.BLUE);
    }

}
