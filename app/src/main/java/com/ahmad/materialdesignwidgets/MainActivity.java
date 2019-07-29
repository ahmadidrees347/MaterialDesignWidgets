package com.ahmad.materialdesignwidgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnFloat,btnInputEditText,btnSnackBar,btnBottonNavigation,btnBottomSheet,task;
    Button btnFlaotingEditText,btnTabLayout, btnViewPager, btnDesign;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFloat =findViewById(R.id.floatingActionButton);
        btnInputEditText =findViewById(R.id.inputEditText);
        btnSnackBar =findViewById(R.id.snackBar);
        btnBottonNavigation =findViewById(R.id.bottomNavigation);
        btnBottomSheet =findViewById(R.id.bottomSheet);
        task = findViewById(R.id.task);
        btnFlaotingEditText = findViewById(R.id.btnfloatingEditText);
        btnTabLayout = findViewById(R.id.btnTabLayout);
        btnViewPager = findViewById(R.id.btnViewPager);
        btnDesign = findViewById(R.id.btnDesign);

        btnFloat.setOnClickListener(this);
        btnInputEditText.setOnClickListener(this);
        btnSnackBar.setOnClickListener(this);
        btnBottonNavigation.setOnClickListener(this);
        btnBottomSheet.setOnClickListener(this);
        task.setOnClickListener(this);
        btnFlaotingEditText.setOnClickListener(this);
        btnTabLayout.setOnClickListener(this);
        btnViewPager.setOnClickListener(this);
        btnDesign.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.floatingActionButton:
            {
                Intent floatingActionButton = new Intent(getApplicationContext(),FloatingActionButton.class);
                startActivity(floatingActionButton);
                break;
            }
            case R.id.inputEditText:
            {
                Intent btnInputEditText = new Intent(getApplicationContext(),InputEditText.class);
                startActivity(btnInputEditText);
                break;
            }
            case R.id.snackBar:
            {
                Intent btnSnackBar = new Intent(getApplicationContext(),SnackBar.class);
                startActivity(btnSnackBar);
                break;
            }
            case R.id.bottomNavigation:
            {
                Intent btnBottonNavigation = new Intent(getApplicationContext(),BottomNavigation.class);
                startActivity(btnBottonNavigation);
                break;
            }
            case R.id.bottomSheet:
            {
                Intent btnBottomSheet = new Intent(getApplicationContext(),BottomSheet.class);
                startActivity(btnBottomSheet);
                break;
            }
            case R.id.task:
            {
                Intent task = new Intent(getApplicationContext(),Task.class);
                startActivity(task);
                break;
            }
            case R.id.btnfloatingEditText:
            {
                Intent floatingEditText = new Intent(getApplicationContext(),FloatingEditText.class);
                startActivity(floatingEditText);
                break;
            }
            case R.id.btnTabLayout:
            {
                Intent btnTabLayout = new Intent(getApplicationContext(),TabLayoutExample.class);
                startActivity(btnTabLayout);
                break;
            }
            case R.id.btnViewPager:
            {
                Intent btnViewPager = new Intent(getApplicationContext(),ViewPagerExample.class);
                startActivity(btnViewPager);
                break;
            }
            case R.id.btnDesign:
            {
                Intent btnDesign = new Intent(getApplicationContext(),Design.class);
                startActivity(btnDesign);
                break;
            }

        }
    }
}
