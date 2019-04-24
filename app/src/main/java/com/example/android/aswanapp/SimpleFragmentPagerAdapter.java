package com.example.android.aswanapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
       private String[] tabTitles= new String[]{};
        public SimpleFragmentPagerAdapter(FragmentManager fm,Context context,String[] tabTitles) {
            super(fm);
           this.tabTitles=tabTitles;
        }

        @Override
        public int getCount() {
         return 4;
        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0) {
                return new HotelsFragment();
            } else if (position == 1){
                return new RestaurantsFragment();
            }

        else if (position == 2){
            return  new TouristicPlacesFragment();
        }
            else{
            return  new SomeNubianWordsFragment();

            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];

        }

    }