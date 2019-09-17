package com.example.automobileassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Regtaion_form extends AppCompatActivity {

    Button btnSubmit;
    EditText txtName,txtGender,txt_email,txt_conNo,txt_add;
    DatabaseReference dbRef;
    Registation reg;

    private void clearControls(){

        txtName.setText("");
        txtGender.setText("");
        txt_email.setText("");
        txt_conNo.setText("");
        txt_add.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regtaion_form);



        txtName = findViewById(R.id.fullNameTextField);
        txtGender = findViewById(R.id.genderTextField);
        txt_email = findViewById(R.id.emailTextField);
        txt_conNo = findViewById(R.id.ConNo);
        txt_add = findViewById(R.id.Address);

        btnSubmit = findViewById(R.id.signInBtn);

        reg = new Registation();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbRef = FirebaseDatabase.getInstance().getReference().child("Registration");

                try {
                    if (TextUtils.isEmpty(txtName.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Name ", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txtGender.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Your Gender ", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txt_email.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Your Email ", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txt_conNo.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Your Contact Number ", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txt_add.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Your Address ", Toast.LENGTH_SHORT).show();

                    else {

                        reg.setName(txtName.getText().toString().trim());
                        reg.setGender(txtGender.getText().toString().trim());
                        reg.setEmail(txt_email.getText().toString().trim());
                        reg.setConNo(Integer.parseInt(txt_conNo.getText().toString().trim()));
                        reg.setAddress(txt_add.getText().toString().trim());


                        dbRef.push().setValue(reg);

                        Toast.makeText(getApplication(), "Data Saved Successfully", Toast.LENGTH_SHORT).show();
                        clearControls();

                    }
                } catch (NumberFormatException e) {

                    Toast.makeText(getApplication(), "Invalid Contact Number", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


    @Override
    protected void onResume() {
        super.onResume();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Regtaion_form.this,Vehicle_Details_Form.class);
                startActivity(intent);
            }
        });

    }
}
