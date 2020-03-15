package com.example.hms.Doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hms.R;

public class AssignLabTest extends AppCompatActivity {
    private TextView testsPrescription;
    private EditText PatientIdTests,commentLabTest;
    private Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_lab_test);

        testsPrescription = findViewById(R.id.testsPrescription);
        PatientIdTests = findViewById(R.id.PatientIdTests);
        commentLabTest = findViewById(R.id.commentLabTest);
        submit = findViewById(R.id.submit);


        Long timestamp = System.currentTimeMillis();
        testsPrescription.setText(timestamp+"");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(PatientIdTests.getText().toString())){
                    if (!TextUtils.isEmpty(commentLabTest.getText().toString())){
                        Toast.makeText(AssignLabTest.this, "Test Uploaded", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(AssignLabTest.this,DoctorActivity.class);
                        startActivity(i);
                    }
                    else{
                        Toast.makeText(AssignLabTest.this, "Enter Comments", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(AssignLabTest.this, "Enter Patient id", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
