package com.example.hms.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hms.R;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Appointments extends AppCompatActivity {
    private Spinner doctorspinner,DateSpinner,TimeSpinner;
    private TextView doctorid;
    private Button bookappointment;
    private String doctor,time,date,_doctorid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointments);

        doctorspinner = findViewById(R.id.doctorspinner);
        DateSpinner = findViewById(R.id.DateSpinner);
        TimeSpinner = findViewById(R.id.TimeSpinner);
        doctorid = findViewById(R.id.doctorid);
        bookappointment = findViewById(R.id.bookappointment);

        List<String> doctors = new ArrayList<>();
        doctors.add("Select Doctor");
        doctors.add("Varun Gupta");
        doctors.add("Tarun Singh");
        doctors.add("Shaik Abdul Razaak");

        List<String> dates = new ArrayList<>();
        dates.add("Select Date");
        dates.add("15 March 2020");
        dates.add("16 March 2020");
        dates.add("17 March 2020");

        List<String> times = new ArrayList<>();
        times.add("Select Time");
        times.add("9:00 AM - 9:15 AM");
        times.add("9:15 AM - 9:30 AM");
        times.add("9:30 AM - 9:45 AM");

        doctorid.setText("-");

        ArrayAdapter<String> doctoradapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,doctors);
        doctorspinner.setAdapter(doctoradapter);

        ArrayAdapter<String> dateadapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,dates);
        DateSpinner.setAdapter(dateadapter);

        ArrayAdapter<String> timeadapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,times);
        TimeSpinner.setAdapter(timeadapter);

        doctorspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1: doctorid.setText("21419");
                            doctor = "Varun Gupta";
                        Log.e(doctor,doctorid.getText().toString());
                            _doctorid = "21419";
                        break;
                    case 2: doctorid.setText("21420");
                        doctor = "Tarun Singh";
                        Log.e(doctor,doctorid.getText().toString());
                        _doctorid = "21420";
                        break;
                    case 3: doctorid.setText("21421");
                        doctor = "Shaik Abdul Razaak";
                        Log.e(doctor,doctorid.getText().toString());
                        _doctorid = "21421";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        DateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 1:
                        date = "15 March 2020";
                        break;
                    case 2:
                        date = "16 March 2020";
                        break;
                    case 3:
                        date = "17 March 2020";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        TimeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        time = "9:00 AM - 9:15 AM";
                        break;
                    case 2:
                        time = "9:15 AM - 9:30 AM";
                        break;
                    case 3:
                        time = "9:30 AM - 9:45 AM";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        bookappointment.setOnClickListener(v -> {
            if (doctorspinner.getSelectedItem().equals("Select Doctor")){
                Toast.makeText(this, "Select Doctor", Toast.LENGTH_SHORT).show();
            }
            else if(TimeSpinner.getSelectedItem().equals("Select Time")){
                Toast.makeText(this, "Select Time", Toast.LENGTH_SHORT).show();
            }
            else if (DateSpinner.getSelectedItem().equals("Select Date")){
                Toast.makeText(this, "Select Date", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Booked", Toast.LENGTH_SHORT).show();
            }
        });






    }
}
