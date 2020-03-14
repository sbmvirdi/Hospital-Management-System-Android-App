package com.example.hms.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hms.Doctor.AssignedRooms;
import com.example.hms.R;
import com.google.android.material.card.MaterialCardView;

public class UserActivity extends AppCompatActivity {
    private MaterialCardView appointmentsCard,testreportscard,treatmentscard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        appointmentsCard = findViewById(R.id.appointmentsCard);
        testreportscard = findViewById(R.id.testreportscard);
        treatmentscard = findViewById(R.id.treatmentscard);

        appointmentsCard.setOnClickListener(v -> {
            Intent i = new Intent(UserActivity.this, Appointments.class);
            startActivity(i);
        });

        testreportscard.setOnClickListener(v -> {
            Intent i = new Intent(UserActivity.this, TestReports.class);
            startActivity(i);

        });

        treatmentscard.setOnClickListener(v -> {
            Intent i = new Intent(UserActivity.this, Treatment.class);
            startActivity(i);

        });

    }
}
