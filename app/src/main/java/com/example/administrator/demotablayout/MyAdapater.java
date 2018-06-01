package com.example.administrator.demotablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MyAdapater extends FragmentStatePagerAdapter{
    ArrayList<String>strings=new ArrayList<>();
    Fragment1 fragment1;
    Fragmrnt2 fragment2;
    public MyAdapater(FragmentManager fm) {
        super(fm);
        strings.add("Fragment 1");
        strings.add("Fragment 2");
        fragment1=new Fragment1();
        fragment2=new Fragmrnt2();
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return fragment1;
        }
        else if(position==1){
            return fragment2;
        }
        else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return strings.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }
}
