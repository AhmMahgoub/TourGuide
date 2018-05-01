package com.example.android.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PagerFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public PagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CafeFragment();
        }
        else if (position == 1) {
            return new EventFragment();
        }
        else if (position == 2) {
            return new RestaurantFragment();
        }
        else {
            return new CardActivity();
        }
    }

        @Nullable
        @Override
        public CharSequence getPageTitle ( int position){

            if (position == 0) {
                return mContext.getString(R.string.category_cafes);
        }
            else if (position == 1) {
                return mContext.getString(R.string.category_Events);
            }
            else if (position == 2) {
                return mContext.getString(R.string.category_Restaurants);
            }
            else {
                return mContext.getString(R.string.category_Historical);
            }
        }
    @Override
    public int getCount () {
        return 4;
    }
}

