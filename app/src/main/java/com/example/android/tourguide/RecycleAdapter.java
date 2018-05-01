package com.example.android.tourguide;

import android.support.v7.widget.RecyclerView;

/**
 * Created by Ahm on 4/30/2018.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder>  {

    private String[] titles = {"Cairo Citadel",
            "Coptic Museum",
            "Egyptian Museum",
            "Museum of Islamic Art",
            "Egyptian Geological Museum",
            "Abdeen Palace",
            };

    private String[] details = {"The Saladin Citadel of Cairo is a medieval Islamic fortification in Cairo, Egypt. The location, on Mokattam hill near the center of Cairo, was once famous for its fresh breeze and grand views of the city",
            "The Coptic Museum is a museum in Coptic Cairo, Egypt with the largest collection of Egyptian Christian artifacts in the world. It was founded by Marcus Simaika in 1908 to house Coptic antiquities",
            "The Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
            "The Museum of Islamic Art, in Cairo, Egypt, is considered one of the greatest in the world, with its exceptional collection of rare woodwork and plaster artefacts, as well as metal, ceramic, glass, crystal, and textile objects of all periods, from all over the Islamic world.",
            "The Egyptian Geological Museum is a museum in Cairo, Egypt. The museum was established in 1904 as part of the Egyptian Geological Survey, which had been started in 1896 under the direction of the Khedive Ismail. The museum was the first of its kind in the Middle East and the African continent.",
            "Built on the site of a small mansion owned by Abidin Bey, Abdeen Palace, which is named after him, is considered one of the most sumptuous palaces in the world in terms of its adornments, paintings, and large number of clocks scattered in the parlors and wings, most of which are decorated with pure gold.",
            "Item seven details",
            "Item eight details"};

    private int[] images = { R.drawable.cairocitadel,
            R.drawable.coptic,
            R.drawable.egyptianmuseum,
            R.drawable.islamicmuseum,
            R.drawable.geological,
            R.drawable.abdeenpalace} ;

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
