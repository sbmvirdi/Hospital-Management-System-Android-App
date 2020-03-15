package com.example.hms.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hms.R;

public class TestReports extends AppCompatActivity {

    private EditText treatmentid;
    private Button viewreport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_reports);

        treatmentid = findViewById(R.id.treatmentid);
        viewreport = findViewById(R.id.viewreport);


        viewreport.setOnClickListener(v -> {
            String treatment = treatmentid.getText().toString();
            if (TextUtils.isEmpty(treatment)){
                Toast.makeText(this, "Enter treatment id", Toast.LENGTH_SHORT).show();
            }
            else{
                // Api call to receive link of image
                String image  = "https://www.shortto.com/reported";
                Intent i = new Intent(TestReports.this,DetailedTestReport.class);
                i.putExtra("link",image);
                startActivity(i);
            }

        });

    }
}
