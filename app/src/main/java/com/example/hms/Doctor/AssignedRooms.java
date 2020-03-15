package com.example.hms.Doctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hms.ModelClass.DoctorAssignedRoom;
import com.example.hms.R;

import java.util.ArrayList;
import java.util.List;

public class AssignedRooms extends AppCompatActivity {
    private RecyclerView recyclerAssignedRoomsToDoctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assigned_rooms);

        recyclerAssignedRoomsToDoctor = findViewById(R.id.recyclerAssignedRoomsToDoctor);
        recyclerAssignedRoomsToDoctor.setLayoutManager(new LinearLayoutManager(this));
        List<DoctorAssignedRoom> list = new ArrayList<>();
        list.add(new DoctorAssignedRoom(403,2021,21419));
        list.add(new DoctorAssignedRoom(404,2021,21419));
        list.add(new DoctorAssignedRoom(405,2021,21419));
        list.add(new DoctorAssignedRoom(406,2021,21419));

        com.example.hms.Adapters.DoctorAssignedRoom adapter = new com.example.hms.Adapters.DoctorAssignedRoom(getApplicationContext(),list);
        recyclerAssignedRoomsToDoctor.setAdapter(adapter);





    }
}
