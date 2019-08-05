package com.example.automobileassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GarageOwnerMenu extends AppCompatActivity {

    private Button btnGargeOwnerRegister;
    private Button btnViewProfile;
    ConstraintLayout constraintLayout;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_owner_menu);

        constraintLayout = findViewById(R.id.layoutOwnerMenu);

        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(8000);
        animationDrawable.setExitFadeDuration(8000);
        animationDrawable.start();

        btnGargeOwnerRegister = findViewById(R.id.btnGargeRegister);
        btnViewProfile = findViewById(R.id.btnSearchGarage);

        btnGargeOwnerRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GarageOwnerMenu.this,GarageRegisterForm.class));
            }
        });

        btnViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GarageOwnerMenu.this,GarageLoginForm.class));
            }
        });
    }
}
