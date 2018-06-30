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

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaFragment extends Fragment {

    public PizzaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.show_list_view, container, false);

        // Array list of Places with names, addresses, phone numbers, images
        final ArrayList<ThePlace> place = new ArrayList<ThePlace>();
        place.add(new ThePlace("Mellow Mushroom", "10959 Causeway Blvd", "813-685-1122", R.drawable.pizza1));
        place.add(new ThePlace("Babe's Pizza", "107 N Kings Ave", "813-689-2282", R.drawable.pizza2));
        place.add(new ThePlace("Romano's Greek Italian Pizzeria", "906 W Robertson St", "813-653-9477", R.drawable.pizza3));

        // Create a PlaceAdapter, whose data source is each_item of ThePlace(s).
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), place);

        // Found in show_list_view.xml
        ListView listView = rootView.findViewById(R.id.the_list_view);

        listView.setAdapter(adapter);

        return rootView;
    }
}