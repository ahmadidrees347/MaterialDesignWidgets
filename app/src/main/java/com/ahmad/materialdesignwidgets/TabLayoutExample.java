package com.ahmad.materialdesignwidgets;

import android.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class TabLayoutExample extends AppCompatActivity {
    FrameLayout frameLayout;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        frameLayout = findViewById(R.id.myFrame);
        tabLayout = findViewById(R.id.btnTabLayout);

        TabLayout.Tab FirstTab = tabLayout.newTab();
        FirstTab.setText("First");
        FirstTab.setIcon(R.drawable.ic_launcher_background);
        tabLayout.addTab(FirstTab);

        TabLayout.Tab SecondTab = tabLayout.newTab();
        SecondTab.setText("Second");
        SecondTab.setIcon(R.drawable.ic_launcher_background);
        tabLayout.addTab(SecondTab);

        TabLayout.Tab ThirdTab = tabLayout.newTab();
        ThirdTab.setText("Third");
        ThirdTab.setIcon(R.drawable.ic_launcher_background);
        tabLayout.addTab(ThirdTab);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == 0) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.myFrame, new FirstFragment()).commit();
                }
                else if (tab.getPosition() == 1) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.myFrame, new SecondFragment()).commit();
                }
                else if (tab.getPosition() == 2) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.myFrame, new ThirdFragment()).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
