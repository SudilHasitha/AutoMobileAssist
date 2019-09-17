package com.example.automobileassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    Button salebtn;
    Button garageBtn;
    ConstraintLayout myLayout;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = findViewById(R.id.myLayout);
        salebtn = findViewById(R.id.buttonSales);

        animationDrawable = (AnimationDrawable) myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(8000);
        animationDrawable.setExitFadeDuration(8000);
        animationDrawable.start();




    }
    protected void onResume() {

        super.onResume();

        salebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Salesmen_Customer.class);
                startActivity(intent);
            }
        });

    }
}


