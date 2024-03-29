package com.ahmad.materialdesignwidgets;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> mystring = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }
    public void addFragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        mystring.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mystring.get(position);
    }
}
