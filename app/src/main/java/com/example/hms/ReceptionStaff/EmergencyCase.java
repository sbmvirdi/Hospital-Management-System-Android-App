package com.example.hms.ReceptionStaff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hms.R;

import java.util.ArrayList;

public class EmergencyCase extends AppCompatActivity {
     TextView patientIDInput;
     EditText ChiefComplaintInput;
     Button generate,submit;
     String doctorselected;
     boolean flag;
     Spinner DoctorsNameInputEmergency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_case);
        patientIDInput=findViewById(R.id.patientIDInput);
        ChiefComplaintInput=findViewById(R.id.ChiefComplaintInput);
        generate=findViewById(R.id.generateEmergencyCase);
        submit=findViewById(R.id.submitEmergency);
        DoctorsNameInputEmergency=findViewById(R.id.DoctorsNameInputEmergency);
        ArrayList<String> doctor  = new ArrayList<>();
        doctor.add("Select Doctor");
        doctor.add("Varun Gupta");
        doctor.add("Tarun Singh");
        doctor.add("Shaik Abdul Razaak");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,doctor);
        DoctorsNameInputEmergency.setAdapter(adapter);

        DoctorsNameInputEmergency.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1: doctorselected  = "Varun Gupta";
                    break;
                    case 2: doctorselected  = "Tarun Singh";
                        break;
                    case 3: doctorselected  = "Shaik Abdul Razaak";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        flag=false;
        generate.setOnClickListener(v -> {
            flag=true;
            generate.setVisibility(View.GONE);
            long timestamp=System.currentTimeMillis();
            patientIDInput.setText(timestamp+"");
        });
        submit.setOnClickListener(v -> {
            if(flag){

                if (DoctorsNameInputEmergency.getSelectedItemPosition() != 0){
                    if (!TextUtils.isEmpty(ChiefComplaintInput.getText().toString())){
                        Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(this, "Enter Complaint", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(this, "Select Doctor", Toast.LENGTH_SHORT).show();
                }
            }
            else {
                Toast.makeText(this, "Please Generate ID First...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
