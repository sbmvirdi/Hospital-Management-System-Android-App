package com.example.hms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.hms.Doctor.DoctorActivity;
import com.example.hms.HeadStaff.HeadStaffActivity;
import com.example.hms.LabIncharge.LabInchargeActivity;
import com.example.hms.ReceptionStaff.ReceptionStaffActivity;
import com.example.hms.Staff.StaffActivity;
import com.example.hms.User.UserActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, UserActivity.class);
                startActivity(i);
                finish();
            }
        },1000);
    }
}
