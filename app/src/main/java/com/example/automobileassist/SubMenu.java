package com.example.automobileassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubMenu extends AppCompatActivity {

    private Button btnGarageOwner;
    private Button btnSearchGarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);

        btnGarageOwner = findViewById(R.id.btnGargeRegister);
        btnSearchGarge = findViewById(R.id.btnSearchGarage);

        btnGarageOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubMenu.this,GarageOwnerMenu.class));
            }
        });

        btnSearchGarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubMenu.this,GarageSearch.class));
            }
        });
    }

}
