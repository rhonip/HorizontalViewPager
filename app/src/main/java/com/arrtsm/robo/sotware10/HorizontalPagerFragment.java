package com.arrtsm.robo.sotware10;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;


public class HorizontalPagerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_horizontal, container, false);
    }

    @Override
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager =
                (HorizontalInfiniteCycleViewPager) view.findViewById(R.id.hicvp);
        horizontalInfiniteCycleViewPager.setAdapter(new HorizontalPagerAdapter(getContext(), false));
        final TextView text = (TextView) view.findViewById(R.id.text);


        /*horizontalInfiniteCycleViewPager.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
             *//*   Toast.makeText(this,
                        "Page " +ho + " clicked",
                        Toast.LENGTH_LONG).show();*//*
                Intent ar_intent=new Intent(HorizontalPagerFragment.this,Test.class);
                startActivity(ar_intent);
            }});*/
        horizontalInfiniteCycleViewPager.setScrollDuration(400);
  //      horizontalInfiniteCycleViewPager.setPageDuration(1000);
        horizontalInfiniteCycleViewPager.setInterpolator(
                AnimationUtils.loadInterpolator(getContext(), android.R.anim.overshoot_interpolator)
        );
        horizontalInfiniteCycleViewPager.setMediumScaled(false);
        horizontalInfiniteCycleViewPager.setMaxPageScale(1.6F);
        horizontalInfiniteCycleViewPager.setMinPageScale(0.5F);
        horizontalInfiniteCycleViewPager.setCenterPageScaleOffset(30.0F);
        horizontalInfiniteCycleViewPager.setMinPageScaleOffset(5.0F);
//horizontalInfiniteCycleViewPager.setOnInfiniteCyclePageTransformListener();

       /* horizontalInfiniteCycleViewPager.setCurrentItem(horizontalInfiniteCycleViewPager.getRealItem() + 1);
        Log.d("test1", "onViewCreated: ");*/
        //Log.i("value3", "position 0: " + 1);


      if(horizontalInfiniteCycleViewPager.getCurrentItem()==1){
           Log.i("value3", "position 0: " + 2);
           horizontalInfiniteCycleViewPager.setBackgroundColor(Color.BLACK);
       }

       horizontalInfiniteCycleViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
           @Override
           public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

           }

           @Override
           public void onPageSelected(int position) {
               if(horizontalInfiniteCycleViewPager.getRealItem()==0)
               {
                   text.setText("hello1");
                   horizontalInfiniteCycleViewPager.setBackgroundResource(R.drawable.bg_main);

                  //Toast.makeText(getContext(), "displayed", Toast.LENGTH_SHORT).show();
               }
               if(horizontalInfiniteCycleViewPager.getRealItem()==1)
               {
                   text.setText("hello2");
                   horizontalInfiniteCycleViewPager.setBackgroundResource(R.drawable.bg_main1);
                   //Toast.makeText(getContext(), "displayed", Toast.LENGTH_SHORT).show();
               }
               if(horizontalInfiniteCycleViewPager.getRealItem()==2)
               {
                   text.setText("hello3");
                   horizontalInfiniteCycleViewPager.setBackgroundResource(R.drawable.bg_main2);
                   //Toast.makeText(getContext(), "displayed", Toast.LENGTH_SHORT).show();
               }
               /*else
                   horizontalInfiniteCycleViewPager.setBackgroundResource(R.drawable.bg_main1);*/
           }

           @Override
           public void onPageScrollStateChanged(int state) {

           }
       });
      text.setText("Hello1");
      horizontalInfiniteCycleViewPager.setBackgroundResource(R.drawable.bg_main);
    }


}
