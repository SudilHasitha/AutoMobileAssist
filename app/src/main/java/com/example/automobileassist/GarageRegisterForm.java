package com.example.automobileassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class GarageRegisterForm extends AppCompatActivity {

    ConstraintLayout mylayout;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_register_form);

        mylayout = findViewById(R.id.mylayout);

        animationDrawable = (AnimationDrawable) mylayout.getBackground();
        animationDrawable.setEnterFadeDuration(8000);
        animationDrawable.setExitFadeDuration(8000);
        animationDrawable.start();
    }
}
