package com.example.automobileassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Salesmen_Customer extends AppCompatActivity {


    Button btn;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salesmen__customer);

        btn =findViewById(R.id.button4);
        btn1 = findViewById(R.id.button5);

    }

    @Override
    protected void onResume() {
        super.onResume();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Salesmen_Customer.this,Registaion_or_Login.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Salesmen_Customer.this,view_Vehicles_Customers.class);
                startActivity(intent);
            }
        });

    }


}
