package com.example.tourguideapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private final String[] tabTitles = {"TOP Visited", "Restaurants", "Supermarkets", "Education"};

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TopVisitedFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new SupermarketsFragment();
            case 3:
                return new EducationFragment();
            default:
                return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
