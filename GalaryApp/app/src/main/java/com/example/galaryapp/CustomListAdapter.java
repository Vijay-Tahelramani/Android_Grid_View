package com.example.galaryapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageIDarray;



    public CustomListAdapter(Activity context, Integer[] imageIDArrayParam){

        super(context,R.layout.galary_layout , imageIDArrayParam);
        this.context = context;
        this.imageIDarray = imageIDArrayParam;

    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowVieW = inflater.inflate(R.layout.galary_layout,null,true);

        ImageView pic = (ImageView)rowVieW.findViewById(R.id.imageView);


        pic.setImageResource(imageIDarray[position]);

        return rowVieW;
    }
}
