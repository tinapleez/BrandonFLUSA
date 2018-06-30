/*
 * Copyright (c) 2018. Tina Taylor All Rights Reserved
 */

package com.freecbdhomebiz.brandonflusa;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by linuser1 on 6/29/18.
 */

public class CuisineAdapter  extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;
    /**
     * Create a new {@link CuisineAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CuisineAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SushiFragment();
        } else if (position == 1) {
            return new PizzaFragment();
        } else if (position == 2) {
            return new BurgersFragment();
        } else {
            return new SweetsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.cuisine_sushi);
        } else if (position == 1) {
            return mContext.getString(R.string.cuisine_pizza);
        } else if (position == 2) {
            return mContext.getString(R.string.cuisine_burgers);
        } else {
            return mContext.getString(R.string.cuisine_sweets);
        }
    }
}
