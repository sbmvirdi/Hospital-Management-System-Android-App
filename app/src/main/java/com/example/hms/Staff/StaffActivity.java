package com.example.hms.Staff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hms.R;
import com.google.android.material.card.MaterialCardView;

public class StaffActivity extends AppCompatActivity {

    private MaterialCardView mydutiescard,viewSalarycard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        viewSalarycard = findViewById(R.id.viewSalarycard);
        mydutiescard = findViewById(R.id.mydutiescard);

        mydutiescard.setOnClickListener(v->{
            Intent i = new Intent(StaffActivity.this,MyDuties.class);
            startActivity(i);
        });

        viewSalarycard.setOnClickListener(v->{
            Intent i = new Intent(StaffActivity.this, ViewSalary.class);
            startActivity(i);
        });
    }
}
