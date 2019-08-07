package com.example.automobileassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class emergencycenter_register extends AppCompatActivity {

    Button btnlogin,emsearchbtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencycenter_register);

        btnlogin = (Button) findViewById(R.id.btnLogin);
        emsearchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(emergencycenter_register.this,e_service_centers_proflle.class));
                Intent intent = new Intent(emergencycenter_register.this, e_service_centers_proflle.class);
                startActivity(intent);
            }
        });
    }
}
