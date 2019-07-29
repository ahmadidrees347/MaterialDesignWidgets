package com.ahmad.materialdesignwidgets;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class BottomNavigation extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.action_camera:
                    {
                        Toast.makeText(BottomNavigation.this, "Camera", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.action_share:
                    {
                        Toast.makeText(BottomNavigation.this, "Share", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.action_send:
                    {
                        Toast.makeText(BottomNavigation.this, "Send", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }

                return true;
            }
        });
    }
}
