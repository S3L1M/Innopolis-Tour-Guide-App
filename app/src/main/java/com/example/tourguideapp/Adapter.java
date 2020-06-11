package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Item> {

    public Adapter(@NonNull Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Item currentItem = getItem(position);
        ImageView img = (ImageView) listItemView.findViewById(R.id.image);
        img.setImageResource(currentItem.getImgSrc());
        TextView tv = (TextView) listItemView.findViewById(R.id.title);
        tv.setText(currentItem.getTitleSrc());

        return listItemView;
    }
}
