package com.giuliolodi.remembr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public static final Integer[] mThumbIdsCon = {
            R.drawable.n1, R.drawable.n2, R.drawable.n3,
            R.drawable.n4, R.drawable.n5, R.drawable.n6,
            R.drawable.n7, R.drawable.n8, R.drawable.n9,
    };
 
    public Integer[] mThumbIds = {
            R.drawable.n1, R.drawable.n2, R.drawable.n3, 
            R.drawable.n4, R.drawable.n5, R.drawable.n6,
            R.drawable.n7, R.drawable.n8, R.drawable.n9,
    };
 
    public ImageAdapter(Context c){
        mContext = c;
    }
 
    @Override
    public int getCount() {
        return mThumbIds.length;
    }
 
    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }
 
    @Override
    public long getItemId(int position) {
        return 0;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(300, 300));

        return imageView;
    }
 
}