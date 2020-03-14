package com.example.hms.Doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.hms.R;
import com.google.android.material.card.MaterialCardView;

public class DoctorActivity extends AppCompatActivity {

    private MaterialCardView appointmentsCard,assignlabtestcard,assignroomscard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        assignroomscard = findViewById(R.id.assignroomscard);
        appointmentsCard = findViewById(R.id.appointmentsCard);
        assignlabtestcard = findViewById(R.id.assignlabtestcard);


        appointmentsCard.setOnClickListener(v->{
            Intent i = new Intent(this,GeneratePrescription.class);
            startActivity(i);
        });

        assignlabtestcard.setOnClickListener(v->{
            Intent i = new Intent(this,AssignLabTest.class);
            startActivity(i);
        });

        assignroomscard.setOnClickListener(v->{
            Intent i = new Intent(this,AssignedRooms.class);
            startActivity(i);
        });

    }
}
