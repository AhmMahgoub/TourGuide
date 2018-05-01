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
        cafes.add(new Information("EGYPT'S JAZZ ALL-STARS @ GRAND NILE TOWER"," 4/30/2018    10:00am - 5:00pm" ,R.drawable.egyptjazz));
        cafes.add(new Information("KARAOKE NIGHT @ ROOM ART SPACE"," 5/01/2018  2:00pm - 8:00pm" ,R.drawable.karaoke));
        cafes.add(new Information("BOARD GAMES NIGHT @ GRAMOPHONE","5/02/2018  10:30am - 9:00pm" ,R.drawable.board));
        cafes.add(new Information("HAZEM SHAHEEN @ EL GENAINA THEATER","5/03/2018   2:00pm - 8:00pm" ,R.drawable.hazem));
        cafes.add(new Information("THE MAGIC OF ALEXANDRIA @ SAFAR KHAN GALLERY","5/04/2018   6:00pm - 10:00pm" ,R.drawable.magic));
        cafes.add(new Information("OM KOLTHOUM PUPPET SHOW @ EL SAWY","5/05/2018   2:00pm - 8:00pm" ,R.drawable.omkalthom));
        cafes.add(new Information("ARTISTS OF TOMORROW @ ARTS-MART","5/06/2018   10:30am - 9:00pm" ,R.drawable.artist));
        cafes.add(new Information("FISHING, NUBIA & HORSES @ PICASSO GALLERY","5/07/2018   6:00pm - 10:00pm" ,R.drawable.nubia));
        cafes.add(new Information("FREE LAUGHTER YOGA @ AL AZHAR PARK","5/08/2018    10:00am - 5:00pm" ,R.drawable.freelaughter));
        cafes.add(new Information("NOSTALGIA WITH HARFOUSH @ L'AUBERGE","5/09/2018   2:00pm - 8:00pm" ,R.drawable.nostaliga));

        InfoAdapter Adapter = new InfoAdapter(getActivity(), cafes, R.color.ListItemColor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(Adapter);
        return rootView;
    }
}
