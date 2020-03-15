package com.example.hms.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hms.Adapters.TreatmentUserAdapter;
import com.example.hms.ModelClass.Treatment_User;
import com.example.hms.R;

import java.util.ArrayList;
import java.util.List;

public class Treatment extends AppCompatActivity {
    private RecyclerView treatment_user_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment);

        treatment_user_recycler = findViewById(R.id.treatment_user_recycler);
        treatment_user_recycler.setLayoutManager(new LinearLayoutManager(this));
        List<Treatment_User> model = new ArrayList<>();
        model.add(new Treatment_User("Varun Gupta","15 March 2020","TB",1400,System.currentTimeMillis()));
        model.add(new Treatment_User("Tarun Singh","14 March 2020","TB",1400,System.currentTimeMillis()));
        TreatmentUserAdapter adapter  = new TreatmentUserAdapter(model,this);
        treatment_user_recycler.setAdapter(adapter);


    }
}
