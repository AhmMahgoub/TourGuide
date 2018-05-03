package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Information> cafes = new ArrayList<Information>();
        cafes.add(new Information(getString(R.string.restaurant_name_1),getString(R.string.restaurant_address_1),getString(R.string.restaurant_phone_1),R.drawable.tresbon));
        cafes.add(new Information(getString(R.string.restaurant_name_2),getString(R.string.restaurant_address_2),getString(R.string.restaurant_phone_2),R.drawable.zooba));
        cafes.add(new Information(getString(R.string.restaurant_name_3),getString(R.string.restaurant_address_3),getString(R.string.restaurant_phone_3),R.drawable.ayadina));
        cafes.add(new Information(getString(R.string.restaurant_name_4),getString(R.string.restaurant_address_4),getString(R.string.restaurant_phone_4),R.drawable.rafaello));
        cafes.add(new Information(getString(R.string.restaurant_name_5),getString(R.string.restaurant_address_5),getString(R.string.restaurant_phone_5),R.drawable.kastan));
        cafes.add(new Information(getString(R.string.restaurant_name_6),getString(R.string.restaurant_address_6),getString(R.string.restaurant_phone_6),R.drawable.planetafrica));
        cafes.add(new Information(getString(R.string.restaurant_name_7),getString(R.string.restaurant_address_7),getString(R.string.restaurant_phone_7),R.drawable.marcedo));
        cafes.add(new Information(getString(R.string.restaurant_name_8),getString(R.string.restaurant_address_8),getString(R.string.restaurant_phone_8),R.drawable.sachi));
        cafes.add(new Information(getString(R.string.restaurant_name_9),getString(R.string.restaurant_address_9),getString(R.string.restaurant_phone_9),R.drawable.stt));
        cafes.add(new Information(getString(R.string.restaurant_name_10),getString(R.string.restaurant_address_10),getString(R.string.restaurant_phone_10),R.drawable.sushi));

        InfoAdapter Adapter = new InfoAdapter(getActivity(), cafes, R.color.ListItemColor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(Adapter);
        return rootView;
    }
}
