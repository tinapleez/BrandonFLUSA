/*
 * Copyright (c) 2018. Tina Taylor All Rights Reserved
 */

package com.freecbdhomebiz.brandonflusa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BurgersFragment extends Fragment {

    public BurgersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.show_list_view, container, false);

        // Array list of Places with names, addresses, phone numbers, images
        final ArrayList<ThePlace> place = new ArrayList<ThePlace>();
        place.add(new ThePlace("Fords Garage", "11105 Causeway Blvd", "813-661-3673", R.drawable.burger1));
        place.add(new ThePlace("Square 1", "2042 Badlands Dr,", "813-6689-1611", R.drawable.burger2));
        place.add(new ThePlace("Hamburger Mary's", "2016 Town Center Blvd", "813-643-2110", R.drawable.burger3));

        // Create a PlaceAdapter, whose data source is each_item of ThePlace(s).
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), place);

        // Found in show_list_view.xml
        ListView listView = rootView.findViewById(R.id.the_list_view);

        listView.setAdapter(adapter);

        return rootView;
    }
}