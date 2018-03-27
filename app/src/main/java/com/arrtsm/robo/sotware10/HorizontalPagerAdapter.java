package com.arrtsm.robo.sotware10;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import jp.wasabeef.blurry.Blurry;

import static com.arrtsm.robo.sotware10.Utils.setupItem;


public class HorizontalPagerAdapter extends PagerAdapter {
    ImageView image1;

    private final Utils.LibraryObject[] LIBRARIES = new Utils.LibraryObject[]{
            new Utils.LibraryObject(
                    R.drawable.design,
                    "Design"

            ),
            new Utils.LibraryObject(
                    R.drawable.dxf,
                    "Dxf Reader"

            ),
            new Utils.LibraryObject(
                    R.drawable.camm,
                    "Camera"

            )
    };

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    private boolean mIsTwoWay;

    public HorizontalPagerAdapter(final Context context, final boolean isTwoWay) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mIsTwoWay = isTwoWay;
    }

    @Override
    public int getCount() {
        return mIsTwoWay ? 6 : LIBRARIES.length;
    }

    @Override
    public int getItemPosition(final Object object) {
        return POSITION_NONE;
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        final View view,view1;
       /* if (mIsTwoWay) {
            view = mLayoutInflater.inflate(R.layout.two_way_item, container, false);

            final VerticalInfiniteCycleViewPager verticalInfiniteCycleViewPager =
                    (VerticalInfiniteCycleViewPager) view.findViewById(R.id.vicvp);
            verticalInfiniteCycleViewPager.setAdapter(
                    new VerticalPagerAdapter(mContext)
            );
            verticalInfiniteCycleViewPager.setCurrentItem(position);
        } else {*/


            view = mLayoutInflater.inflate(R.layout.item, container, false);
        image1= (ImageView) view.findViewById(R.id.img_item);
        image1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(position==0){
                    Intent toy = new Intent(mContext, Test.class);
                    mContext.startActivity(toy);
                Log.d("valuetest", "onClick: ");}
                if(position==1){
                    Intent toy = new Intent(mContext, Test.class);
                    mContext.startActivity(toy);
                    Log.d("valuetest", "onClick: ");}
                if(position==2){
                    Intent toy = new Intent(mContext, Test.class);
                    mContext.startActivity(toy);
                    Log.d("valuetest", "onClick: ");}
            }});

            setupItem(view, LIBRARIES[position]);
            //setupItem(view1,LIBRARIES[position]);
       /* }*/

        container.addView(view);


        return view;
        /*LayoutInflater inflater = (LayoutInflater) container.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View page = inflater.inflate(R.layout.activity_main, null);
        page.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //this will log the page number that was click
                Log.i("TAG", "This page was clicked: " + position);
            }
        });


        ((ViewPager) container).addView(page, 0);
        return page;*/
    }

    @Override
    public boolean isViewFromObject(final View view, final Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(final ViewGroup container, final int position, final Object object) {
        container.removeView((View) object);
    }

public void test(){

    image1.setImageResource(R.drawable.logo);


}
}
