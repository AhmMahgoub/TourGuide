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
public class EventFragment extends Fragment {

    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Information> cafes = new ArrayList<Information>();
        cafes.add(new Information(getString(R.string.event_name_1),getString(R.string.event_date_1),R.drawable.egyptjazz));
        cafes.add(new Information(getString(R.string.event_name_2),getString(R.string.event_date_2),R.drawable.karaoke));
        cafes.add(new Information(getString(R.string.event_name_3),getString(R.string.event_date_3),R.drawable.board));
        cafes.add(new Information(getString(R.string.event_name_4),getString(R.string.event_date_4),R.drawable.hazem));
        cafes.add(new Information(getString(R.string.event_name_5),getString(R.string.event_date_5),R.drawable.magic));
        cafes.add(new Information(getString(R.string.event_name_6),getString(R.string.event_date_6),R.drawable.omkalthom));
        cafes.add(new Information(getString(R.string.event_name_7),getString(R.string.event_date_7),R.drawable.artist));
        cafes.add(new Information(getString(R.string.event_name_8),getString(R.string.event_date_8),R.drawable.nubia));
        cafes.add(new Information(getString(R.string.event_name_9),getString(R.string.event_date_9),R.drawable.freelaughter));
        cafes.add(new Information(getString(R.string.event_name_10),getString(R.string.event_date_10),R.drawable.nostaliga));
        
        InfoAdapter Adapter = new InfoAdapter(getActivity(), cafes, R.color.ListItemColor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(Adapter);
        return rootView;
    }
}
