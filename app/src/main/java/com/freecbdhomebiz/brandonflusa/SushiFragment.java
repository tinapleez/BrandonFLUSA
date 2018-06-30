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
public class SushiFragment extends Fragment {


    public SushiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.show_list_view, container, false);

        // Array list of Places with names, addresses, phone numbers, images
        final ArrayList<ThePlace> place = new ArrayList<ThePlace>();
        place.add(new ThePlace("Sushi Maru", "2020 W Brandon Blvd", "813-657-6278", R.drawable.sushi1 ));
        place.add(new ThePlace("Tsunami Sushi & Hibachi Grill", "2020 Badlands Dr", "813-657-8988", R.drawable.sushi2 ));
        place.add(new ThePlace("Sushi Ninja", "887 E Bloomingdale Ave", "813-662-3377", R.drawable.sushi3 ));

        // Create a PlaceAdapter, whose data source is each_item of ThePlace(s).
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), place);

        // Found in show_list_view.xml
        ListView listView = rootView.findViewById(R.id.the_list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}
