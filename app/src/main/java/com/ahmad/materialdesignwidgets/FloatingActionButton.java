package com.ahmad.materialdesignwidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FloatingActionButton extends AppCompatActivity {

    android.support.design.widget.FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);
        
        floatingActionButton = findViewById(R.id.floatface);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloatingActionButton.this, "Float", Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}
