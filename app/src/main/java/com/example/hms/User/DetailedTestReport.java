package com.example.hms.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.hms.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class DetailedTestReport extends AppCompatActivity {
    private ImageView detailed_user_treatment_report;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_user_test_report);

        progress = findViewById(R.id.progress);

        detailed_user_treatment_report = findViewById(R.id.detailed_user_treatment_report);

        String imagelink = getIntent().getStringExtra("link");
        Log.e("val",imagelink);
        Picasso.get().load(imagelink).into(detailed_user_treatment_report, new Callback() {
            @Override
            public void onSuccess() {
                Log.e("SUCCESS","");
                progress.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                Log.e("ERROR",e.getMessage()+"");
            }
        });
    }
}
