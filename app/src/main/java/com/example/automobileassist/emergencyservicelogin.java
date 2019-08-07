package com.example.automobileassist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class emergencyservicelogin extends AppCompatActivity {
    Button proflogin;
    Button regbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencyservicelogin);

        proflogin = findViewById(R.id.btnLogin);
        regbtn = findViewById(R.id.emc_registerf);

        proflogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(emergencyservicelogin.this,e_service_centers_proflle.class);
                startActivity(intent);
            }
        });

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(emergencyservicelogin.this,emergencycenter_register.class);
                startActivity(intent);
            }
        });
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        proflogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(emergencyservicelogin.this,e_service_centers_proflle.class);
//                startActivity(intent);
//            }
//        });
//
//        regbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(emergencyservicelogin.this,emergencycenter_register.class);
//                startActivity(intent);
//            }
//        });
//    }




}

