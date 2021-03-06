package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CardActivity extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    public CardActivity() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] titels = {getString(R.string.card_title_1),getString(R.string.card_title_2),getString(R.string.card_title_3)
                               ,getString(R.string.card_title_4),getString(R.string.card_title_5),getString(R.string.card_title_6)};
        String[] detail ={getString(R.string.card_details_1),getString(R.string.card_details_1),getString(R.string.card_details_1)
                         ,getString(R.string.card_details_1),getString(R.string.card_details_1),getString(R.string.card_details_1)};

        View rootView = inflater.inflate(R.layout.activity_card, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecycleAdapter(getActivity(),titels,detail);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
