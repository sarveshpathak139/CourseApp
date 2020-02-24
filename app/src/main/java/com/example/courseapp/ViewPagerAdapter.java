package com.example.courseapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> fragmentlist = new ArrayList<>();
    private final ArrayList<String> fragmenttitle = new ArrayList<>();

    public  ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        return  fragmentlist.get(position);
    }

    @Override
    public  int getCount(){
        return  fragmentlist.size();
    }

    public  void addFragment(Fragment fragment,String title){
        fragmentlist.add(fragment);
        fragmenttitle.add(title);
    }

    public  CharSequence getPageTitle(int position){
        return fragmenttitle.get(position);
    }
}
