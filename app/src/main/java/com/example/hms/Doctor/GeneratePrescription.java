package com.example.hms.Doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hms.R;

public class GeneratePrescription extends AppCompatActivity {
    private TextView treatmentIdPrescription,doctorsNamePrescription;
    private EditText PatientIdPrescription;
    private Button addButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_prescription);

        treatmentIdPrescription = findViewById(R.id.treatmentIdPrescription);
        doctorsNamePrescription = findViewById(R.id.doctorsNamePrescription);
        PatientIdPrescription = findViewById(R.id.PatientIdPrescription);

        addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(v -> {

        });

        PatientIdPrescription.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 6){
                    //API post data
                    PostPatientData(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }

    private void PostPatientData(String toString) {

        // api call
    }
}
