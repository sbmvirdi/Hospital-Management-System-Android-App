package com.example.hms.ReceptionStaff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hms.R;

import org.w3c.dom.Text;

public class CalculateBill extends AppCompatActivity {

    private EditText treatmentid;
    private EditText roomcharges,basic_charges,treatmentcharges,labcharges,dispancarycharges,totalcharges;
    private Button submitbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_bill);

        treatmentid = findViewById(R.id.treatmentid);
        roomcharges = findViewById(R.id.roomcharges);
        basic_charges = findViewById(R.id.basic_charges);
        treatmentcharges = findViewById(R.id.treatmentcharges);
        labcharges = findViewById(R.id.labcharges);
        dispancarycharges = findViewById(R.id.dispancarycharges);
        totalcharges = findViewById(R.id.totalcharges);
        submitbill= findViewById(R.id.submitbill);

        basic_charges.setText("250");
        basic_charges.setEnabled(false);


        submitbill.setOnClickListener(v->{
            if (TextUtils.isEmpty(treatmentid.getText().toString())){
                Toast.makeText(this, "Enter Treatment ID", Toast.LENGTH_SHORT).show();
            }else if (TextUtils.isEmpty(roomcharges.getText().toString())){
                Toast.makeText(this, "Enter Room Charges", Toast.LENGTH_SHORT).show();
            }else if (TextUtils.isEmpty(treatmentcharges.getText().toString())){
                Toast.makeText(this, "Enter Treatment Charges", Toast.LENGTH_SHORT).show();
            }else if (TextUtils.isEmpty(labcharges.getText().toString())){
                Toast.makeText(this, "Enter Lab Charges", Toast.LENGTH_SHORT).show();
            }else if (TextUtils.isEmpty(dispancarycharges.getText().toString())){
                Toast.makeText(this, "Enter Dispancary Charges", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
