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
public class SweetsFragment extends Fragment {


    public SweetsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.show_list_view, container, false);

        // Array list of Places with names, addresses, phone numbers, images
        final ArrayList<ThePlace> place = new ArrayList<ThePlace>();
        place.add(new ThePlace("The Revolution Ice Cream Co", "220 W Brandon Blvd #104", "813-857-3250", R.drawable.sweet1));
        place.add(new ThePlace("Jeremiah's Italian Ice", "825 E Bloomingdale Ave", "813-324-8900", R.drawable.sweet2));
        place.add(new ThePlace("Campbell's Dairyland", "200 S Parsons Ave", "813-685-1189", R.drawable.sweet3));

        // Create a PlaceAdapter, whose data source is each_item of ThePlace(s).
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), place);

        // Found in show_list_view.xml
        ListView listView = rootView.findViewById(R.id.the_list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}
