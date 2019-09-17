package com.example.automobileassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Form extends AppCompatActivity {

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__form);

    btnLogin = findViewById(R.id.button6);

    }

protected void onResume() {

    super.onResume();

    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Login_Form.this, Vehicle_Details_Form.class);
            startActivity(intent);
        }
    });

    }
}
