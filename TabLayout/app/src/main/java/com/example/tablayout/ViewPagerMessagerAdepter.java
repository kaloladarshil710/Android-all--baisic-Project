package com.example.tablayout;

import androidx.annotation.NonNull; 
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessagerAdepter extends FragmentPagerAdapter {

    public ViewPagerMessagerAdepter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new ChatFragment();
        } else if (position==1) {
        return new StatusFragment();
        }else if(position==2){
            return  new CallsFragment();
        }else {
            return new ChatFragment();
        }

    }

    @Override
    public int getCount() {
        return 3; //no of tab
    }



    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Chats";
        } else if (position == 1) {
            return "Status";
        } else if (position == 2) {
            return "Calls";
        } else {
            return "Chats";
        }
    }
}
