package com.example.hms.ReceptionStaff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.hms.R;
import com.google.android.material.card.MaterialCardView;

public class ReceptionStaffActivity extends AppCompatActivity {

    private MaterialCardView emergencycasecard,calculatebillCard,createpatientidcard,viewSalarycard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reception_staff);

        emergencycasecard = findViewById(R.id.emergencycasecard);
        calculatebillCard = findViewById(R.id.calculatebillCard);
        createpatientidcard = findViewById(R.id.createpatientidcard);
        viewSalarycard = findViewById(R.id.viewSalarycard);

        emergencycasecard.setOnClickListener(v->{
            Intent i = new Intent(ReceptionStaffActivity.this,EmergencyCase.class);
            startActivity(i);
        });

        calculatebillCard.setOnClickListener(v->{
            Intent i = new Intent(ReceptionStaffActivity.this,CalculateBill.class);
            startActivity(i);

        });

        createpatientidcard.setOnClickListener(v->{
            Intent i = new Intent(ReceptionStaffActivity.this,CreatePatientID.class);
            startActivity(i);

        });

        viewSalarycard.setOnClickListener(v->{
            Intent i = new Intent(ReceptionStaffActivity.this,ViewSalary.class);
            startActivity(i);

        });

    }
}
