package com.ahmad.materialdesignwidgets;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SnackBar extends AppCompatActivity implements View.OnClickListener{

    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);

        floatingActionButton =findViewById(R.id.float_face);

        floatingActionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Snackbar snackBar = Snackbar.make(findViewById(R.id.coordination),"No Internet Connection",Snackbar.LENGTH_LONG).setAction("Retry", new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(SnackBar.this, "Done", Toast.LENGTH_SHORT).show();
            }
        });
        snackBar.show();
    }
}
