package com.example.hms.LabIncharge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.hms.R;
import com.google.android.material.card.MaterialCardView;

public class LabInchargeActivity extends AppCompatActivity {
    private MaterialCardView UpcomingTestsCard,uploadCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_incharge);

        UpcomingTestsCard = findViewById(R.id.UpcomingTestsCard);
        uploadCard = findViewById(R.id.uploadCard);

        UpcomingTestsCard.setOnClickListener(v->{
            Intent i = new Intent(LabInchargeActivity.this,UpcomingTests.class);
            startActivity(i);
        });


        uploadCard.setOnClickListener(v->{
            Intent i = new Intent(LabInchargeActivity.this,UploadTests.class);
            startActivity(i);
        });


    }
}
