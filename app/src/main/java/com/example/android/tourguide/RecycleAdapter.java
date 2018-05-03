package com.example.android.tourguide;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
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

    String[] titels;
    String[] details;
    Context c;

    public RecycleAdapter(Context c, String[] titels,String[] details) {
        this.c = c;
        this.titels = titels;
        this.details = details;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);

            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =(TextView)itemView.findViewById(R.id.item_detail);
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
        viewHolder.itemTitle.setText(titels[i]);
        viewHolder.itemDetail.setText(details[i]);
    }

    @Override
    public int getItemCount() {
        return titels.length;
    }
}
