package com.example.hms.HeadStaff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.hms.Doctor.AssignedRooms;
import com.example.hms.R;
import com.google.android.material.card.MaterialCardView;

public class HeadStaffActivity extends AppCompatActivity {

    private MaterialCardView AssignRoomsCard,generateSalarycard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_staff);

        generateSalarycard = findViewById(R.id.generateSalarycard);
        AssignRoomsCard = findViewById(R.id.AssignRoomsCard);

        generateSalarycard.setOnClickListener(v->{
            Intent i = new Intent(HeadStaffActivity.this,GenerateSalary.class);
            startActivity(i);
        });

        AssignRoomsCard.setOnClickListener(v->{

            Intent i = new Intent(HeadStaffActivity.this, AssignedRooms.class);
            startActivity(i);
        });

    }
}
