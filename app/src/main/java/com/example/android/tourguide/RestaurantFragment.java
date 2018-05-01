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
        cafes.add(new Information("Très Bon","14 Ghernata Street, Korba, Heliopolis"," 02 24517656",R.drawable.tresbon));
        cafes.add(new Information("Zooba","13، Baghdad St, Heliopolis","16082",R.drawable.zooba));
        cafes.add(new Information("Ayadina","3, Cleopatra, El-Montaza"," 0102 333 1599",R.drawable.ayadina));
        cafes.add(new Information("Raffaello Restaurant"," 11, Sesostris, El-Montaza"," 0128 522 8665",R.drawable.rafaello));
        cafes.add(new Information("Kastan"," Abou Dawoud Al Zaher"," 02 22723062",R.drawable.kastan));
        cafes.add(new Information("Planet Africa","Omar Ibn El-Khattab","02 24802949",R.drawable.planetafrica));
        cafes.add(new Information("Mercado Restaurant & Cafe","El Hegaz St, El-Bostan","02 24806868",R.drawable.marcedo));
        cafes.add(new Information("SACHI Restaurant","3, Cleopatra St. Korba"," 0128 090 2028",R.drawable.sachi));
        cafes.add(new Information("JW Steak House","Ring Road- Mirage City- Box 427 Heliopolis"," 02 24065849",R.drawable.stt));
        cafes.add(new Information("Sushi Bar","Ring Road- Mirage City"," 02 24115588",R.drawable.sushi));

        InfoAdapter Adapter = new InfoAdapter(getActivity(), cafes, R.color.ListItemColor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(Adapter);
        return rootView;
    }
}
