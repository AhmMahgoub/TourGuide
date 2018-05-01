package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Information> {
    private int mColorResourceId;

    public InfoAdapter(Activity context, ArrayList<Information> numbersInEnglish, int colorResourceId) {
        super(context, 0, numbersInEnglish);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
    }
        Information currentTitleInfo = getItem(position);
        TextView Title = (TextView) convertView.findViewById(R.id.Title);
        Title.setText(currentTitleInfo.getmTitle());

        Information currentSubTitleInfo = getItem(position);
        TextView SubTitle = (TextView) convertView.findViewById(R.id.SubTitle);
        SubTitle.setText(currentSubTitleInfo.getmSubTitle());

        Information additionalInfo = getItem(position);
        TextView addInfo = (TextView) convertView.findViewById(R.id.InfoA);

        if(getItem(position).hasText()) {
            addInfo.setText(additionalInfo.getmInfo());
            addInfo.setVisibility(View.VISIBLE);
        }else{
                addInfo.setVisibility(View.GONE);
            }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.list_item_icon);
        imageView.setImageResource(getItem(position).getmImageResourceId());

        View textContainer = convertView.findViewById(R.id.backGround);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return convertView;
    }
}
