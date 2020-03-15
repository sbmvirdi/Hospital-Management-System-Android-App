package com.example.hms.Doctor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hms.R;

import java.util.ArrayList;
import java.util.List;

public class GeneratePrescription extends AppCompatActivity {
    private TextView treatmentIdPrescription,doctorsNamePrescription;
    private EditText PatientIdPrescription;
    private ListView recyclerPrescription;
    private Button addButton,submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_prescription);
        List<String> medlist = new ArrayList<>();

        recyclerPrescription = findViewById(R.id.recyclerPrescription);
        treatmentIdPrescription = findViewById(R.id.treatmentIdPrescription);
        doctorsNamePrescription = findViewById(R.id.doctorsNamePrescription);
        PatientIdPrescription = findViewById(R.id.PatientIdPrescription);

        addButton = findViewById(R.id.addButton);
        submit = findViewById(R.id.submit);


        submit.setOnClickListener(v -> {
            if (!medlist.isEmpty()){
                if (!TextUtils.isEmpty(PatientIdPrescription.getText().toString())){
                    Intent i = new Intent(this,DoctorActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(this, "enter all details", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(this, "add medicines", Toast.LENGTH_SHORT).show();
            }
        });


        addButton.setOnClickListener(v -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            View view  = LayoutInflater.from(getApplicationContext()).inflate(R.layout.alertdialog_add_medicine_doctor,null);
            Button ok = view.findViewById(R.id.addmedicine);
            EditText medname = view.findViewById(R.id.medicinename);
            ok.setOnClickListener(v1 -> {
                if (!TextUtils.isEmpty(medname.getText().toString())){
                    medlist.add(medname.getText().toString());
                    Log.e("MEDLIST",medname.getText().toString());
                    setupRecycler(medlist);
                }
            });

            builder.setView(view);
            builder.show();
        });

        Long timestamp = System.currentTimeMillis();
        treatmentIdPrescription.setText(timestamp+"");

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

    private void setupRecycler(List<String> medlist) {

        for (String a: medlist){
            Log.e("VAL",a);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,medlist);
        recyclerPrescription.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void PostPatientData(String toString) {

        // api call
    }
}
