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
        cafes.add(new Information("Cafe Corniche"," Corniche El Nil, Garden City","02 27988000",R.drawable.cafecorniche));
        cafes.add(new Information("Zitouni","1089 Corniche El Nil","02 27916877",R.drawable.zitouni));
        cafes.add(new Information("El-Fishawi"," El-Fishawi, Khan al-Khalili"," 0102 749 9420",R.drawable.fishawy));
        cafes.add(new Information("Beano's Cafe","Omar Al Khayam, Zamalek"," 02 33001887",R.drawable.beanos));
        cafes.add(new Information("O's Pasta","159 Twenty-Sixth of July Street","0100 415 5756",R.drawable.ospasta));
        cafes.add(new Information("The Osmanly Restaurant"," Kempinski Nile Hotel","02 27980000",R.drawable.osmanly));
        cafes.add(new Information("Cilantro","33 Mohammed Mahmoud, Ad Dawawin , cairo","02 24619105",R.drawable.cilantro));
        cafes.add(new Information("Sabaya","Qasr Ad Dobarah, cairo"," 02 27957171",R.drawable.sabaya));
        cafes.add(new Information("Eish + Malh","Downtown, 11121","0109 874 4014",R.drawable.eish));
        cafes.add(new Information("Abou Tarek","26 El-Shaikh Marouf","0100 635 3620",R.drawable.tarek));

        InfoAdapter Adapter = new InfoAdapter(getActivity(), cafes, R.color.ListItemColor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(Adapter);
        return rootView;
    }
}
