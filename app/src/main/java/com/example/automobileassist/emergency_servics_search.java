package com.example.automobileassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class emergency_servics_search extends AppCompatActivity {

    Button emsearchbtn;
    Button emloginreg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_servics_search);

        emsearchbtn = (Button) findViewById(R.id.emserch);

        emsearchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(emergency_servics_search.this, find_emergency_service.class));
            }
        });

        emloginreg = (Button) findViewById(R.id.em_menu_login);
        emloginreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(emergency_servics_search.this,emergencycenters_login.class));
//                        Intent intent = new Intent(emergency_servics_search.this, emergencycenters_login.class);
//                        startActivity(intent);
                startActivity(new Intent(emergency_servics_search.this,emergencyservicelogin.class));

            }
        });

    }
}
