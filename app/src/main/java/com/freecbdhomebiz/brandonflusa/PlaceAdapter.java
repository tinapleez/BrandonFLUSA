/*
 * Copyright (c) 2018. Tina Taylor All Rights Reserved
 */

package com.freecbdhomebiz.brandonflusa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter {

    public PlaceAdapter(Context context, ArrayList place) {
        super(context, 0, place);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.each_item, parent, false);
        }

        ThePlace currentPlace = (ThePlace) getItem(position);

        TextView name = listItemView.findViewById(R.id.text_name);
        name.setText(currentPlace.getName());

        TextView address = listItemView.findViewById(R.id.text_address);
        address.setText(currentPlace.getAddress());

        TextView phone = listItemView.findViewById(R.id.text_phone);
        phone.setText(currentPlace.getPhone());

        ImageView imageView = listItemView.findViewById(R.id.image_view_main);

        // Check if there is an image
        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}