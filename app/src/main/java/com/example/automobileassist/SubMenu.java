package com.example.automobileassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SubMenu extends AppCompatActivity {

    private Button btnGarageOwner;
    private Button btnSearchGarge;

    ConstraintLayout constraintLayout;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);

        constraintLayout = (ConstraintLayout)findViewById(R.id.layoutSubMenu);
        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(8000);
        animationDrawable.setExitFadeDuration(8000);
        animationDrawable.start();


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
