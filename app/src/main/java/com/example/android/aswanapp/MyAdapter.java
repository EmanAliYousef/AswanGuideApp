package com.example.android.aswanapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter<A> extends ArrayAdapter<AswanData> {
    public MyAdapter(Context context, ArrayList<AswanData> data) {
        super(context, 0,data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        AswanData currentAswanData = getItem(position);

        TextView nameTextView=(TextView)listItemView.findViewById(R.id.name);
        nameTextView.setText(currentAswanData.getName());

        TextView describtionTextView=(TextView)listItemView.findViewById(R.id.describtion);
        describtionTextView.setText(currentAswanData.getDescribtion());

        ImageView image=(ImageView)listItemView.findViewById(R.id.image);

        image.setImageResource(currentAswanData.getImageResource());

        return listItemView;
    }

}

