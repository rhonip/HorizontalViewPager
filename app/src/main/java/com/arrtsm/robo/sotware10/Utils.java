package com.arrtsm.robo.sotware10;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Utils {

    public static void setupItem(final View view, final LibraryObject libraryObject) {
        final TextView txt = (TextView) view.findViewById(R.id.txt_item);
        txt.setText(libraryObject.getTitle());

        /*final ImageView img = (ImageView) view.findViewById(R.id.img_item);
        img.setImageResource(libraryObject.getRes());*/
        ImageView imageView = (ImageView) view.findViewById(R.id.img_item);
        //Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.nature);
        //Bitmap blurredBitmap = blur(bitmap);
        //imageView.setImageBitmap(blurredBitmap);

        imageView.setImageResource(libraryObject.getRes());

       /* imageView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Log.d("valuetest", "onClick: ");
            }});*/
    }

    public static class LibraryObject {

        private String mTitle;
        private int mRes;


        public LibraryObject(final int res, final String title) {
            mRes = res;
            mTitle = title;

        }


        public String getTitle() {
            return mTitle;
        }

       /* public void setTitle(final String title) {
            mTitle = title;
        }*/

        public int getRes() {


            return mRes;
        }

        public void setRes(final int res) {
            mRes = res;
        }
    }
    /*private static final float BLUR_RADIUS = 25f;
    public Bitmap blur(Bitmap image) {
        if (null == image) return null;
        Bitmap outputBitmap = Bitmap.createBitmap(image);
        final RenderScript renderScript = RenderScript.create(this);
        Allocation tmpIn = Allocation.createFromBitmap(renderScript, image);
        Allocation tmpOut = Allocation.createFromBitmap(renderScript, outputBitmap);
        //Intrinsic Gausian blur filter
        ScriptIntrinsicBlur theIntrinsic = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        theIntrinsic.setRadius(BLUR_RADIUS);
        theIntrinsic.setInput(tmpIn);
        theIntrinsic.forEach(tmpOut);
        tmpOut.copyTo(outputBitmap);
        return outputBitmap;
    }*/

}
