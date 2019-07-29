package com.ahmad.materialdesignwidgets;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class InputEditText extends AppCompatActivity implements View.OnClickListener{

    TextInputEditText edt_email,edt_pswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_edit_text);

        edt_email = findViewById(R.id.email);
        edt_pswd = findViewById(R.id.password);

        edt_email.setOnClickListener(this);
        edt_pswd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.email:
            {
                Toast.makeText(this, "Email", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.password:
            {
                Toast.makeText(this, "Password", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
