package com.ahmad.materialdesignwidgets;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPagerExample extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.myViewPager);
        addTabs(viewPager);

        tabLayout = findViewById(R.id.myTabLayout);
        tabLayout.setupWithViewPager(viewPager);
        setUpTabIcon();


    }
    private void setUpTabIcon()
    {
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_launcher_background);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_launcher_background);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_launcher_background);
    }
    private void addTabs(ViewPager viewPager)
    {
        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FirstFragment(),"FIRST");
        viewPagerAdapter.addFragment(new SecondFragment(),"Second");
        viewPagerAdapter.addFragment(new ThirdFragment(),"Third");

        viewPager.setAdapter(viewPagerAdapter);
    }
}
