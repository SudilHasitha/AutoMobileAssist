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

public class Vehicle_Details_Form extends AppCompatActivity {

    EditText txtName,txtRegNum,txtAddress,txtClass,txtVehicleClass,fuelUse;


    Button btnInsert;
    Button btnUpdate;

    DatabaseReference dbRef;
    VehicleDetails veh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle__details__form);

        txtName = findViewById(R.id.editText5);
        txtRegNum = findViewById(R.id.editText9);
        txtAddress = findViewById(R.id.editText11);
        txtClass = findViewById(R.id.editText13);
        txtVehicleClass = findViewById(R.id.editText14);
        fuelUse = findViewById(R.id.editText15);

        btnInsert = findViewById(R.id.insert);
        btnUpdate = findViewById(R.id.update);

        veh = new VehicleDetails();

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbRef = FirebaseDatabase.getInstance().getReference().child("VehicleDetails");

                try {
                    if (TextUtils.isEmpty(txtName.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Name ", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txtRegNum.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Your Register Number ", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txtAddress.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Your Address ", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txtClass.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Your Class ", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txtVehicleClass.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Your Vehicle class ", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(fuelUse.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please Enter Fuel Used ", Toast.LENGTH_SHORT).show();

                    else {

                        veh.setName(txtName.getText().toString().trim());
                        veh.setRegNo(Integer.parseInt(txtRegNum.getText().toString().trim()));
                        veh.setAddress(txtAddress.getText().toString().trim());
                        veh.setMarkersClass(txtClass.getText().toString().trim());
                        veh.setVehicleClass(txtVehicleClass.getText().toString().trim());
                        veh.setFueluse(fuelUse.getText().toString().trim());

                        dbRef.push().setValue(veh);

                        Toast.makeText(getApplication(), "Data Saved Successfully", Toast.LENGTH_SHORT).show();


                    }
                } catch (NumberFormatException e) {

                    Toast.makeText(getApplication(), "Invalid Contact Number", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


    protected void onResume() {

        super.onResume();

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vehicle_Details_Form.this,Search_Vehicle.class);
                startActivity(intent);
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vehicle_Details_Form.this, Vehicle_Details_Form.class);
                startActivity(intent);
            }
        });
    }
}
