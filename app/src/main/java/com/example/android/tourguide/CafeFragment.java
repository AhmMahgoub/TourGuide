package com.example.android.tourguide;

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
public class CafeFragment extends Fragment {

    public CafeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Information> cafes = new ArrayList<Information>();
        cafes.add(new Information(getString(R.string.cafe_name_1),getString(R.string.cafe_address_1),getString(R.string.cafe_phone_1),R.drawable.cafecorniche));
        cafes.add(new Information(getString(R.string.cafe_name_2),getString(R.string.cafe_address_2),getString(R.string.cafe_phone_2),R.drawable.zitouni));
        cafes.add(new Information(getString(R.string.cafe_name_3),getString(R.string.cafe_address_3),getString(R.string.cafe_phone_3),R.drawable.fishawy));
        cafes.add(new Information(getString(R.string.cafe_name_4),getString(R.string.cafe_address_4),getString(R.string.cafe_phone_4),R.drawable.beanos));
        cafes.add(new Information(getString(R.string.cafe_name_5),getString(R.string.cafe_address_5),getString(R.string.cafe_phone_5),R.drawable.ospasta));
        cafes.add(new Information(getString(R.string.cafe_name_6),getString(R.string.cafe_address_6),getString(R.string.cafe_phone_6),R.drawable.osmanly));
        cafes.add(new Information(getString(R.string.cafe_name_7),getString(R.string.cafe_address_7),getString(R.string.cafe_phone_7),R.drawable.cilantro));
        cafes.add(new Information(getString(R.string.cafe_name_8),getString(R.string.cafe_address_8),getString(R.string.cafe_phone_8),R.drawable.sabaya));
        cafes.add(new Information(getString(R.string.cafe_name_9),getString(R.string.cafe_address_9),getString(R.string.cafe_phone_9),R.drawable.eish));
        cafes.add(new Information(getString(R.string.cafe_name_10),getString(R.string.cafe_address_10),getString(R.string.cafe_phone_10),R.drawable.tarek));

        InfoAdapter Adapter = new InfoAdapter(getActivity(), cafes, R.color.ListItemColor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(Adapter);
        return rootView;
    }
}
