package com.example.hms.HeadStaff;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hms.ModelClass.RoomMode;
import com.example.hms.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static com.example.hms.R.layout.activity_assign_rooms;

public class AssignRooms extends AppCompatActivity {
EditText treatmentId,RoomNumberInput,patientIDInput;
Button submit;
List<RoomMode>list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_assign_rooms);
        treatmentId=findViewById(R.id.treatmentIdInput);
        submit=findViewById(R.id.submitRooms);
        RoomNumberInput=findViewById(R.id.RoomNumberInput);
        patientIDInput=findViewById(R.id.patientIDInput);
        String[] RoomNumber ={"101","102","103","104","105","106","107","108","109"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,RoomNumber);


        submit.setOnClickListener(v -> {

            if(TextUtils.isEmpty(treatmentId.getText().toString())){
                Toast.makeText(this, "Please enter the treatment Table", Toast.LENGTH_SHORT).show();
            }else if(TextUtils.isEmpty(RoomNumberInput.getText().toString())){
                Toast.makeText(this, "Please enter the Room Number", Toast.LENGTH_SHORT).show();
            }else if (TextUtils.isEmpty(patientIDInput.getText().toString())){
                Toast.makeText(this, "Please Enter the Patient Id", Toast.LENGTH_SHORT).show();
            }else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.alertdialog_assignrooms, null, false);
                Button button = view.findViewById(R.id.roomNumberSubmit);
                EditText editText = view.findViewById(R.id.roomNumberInputAssign);
                button.setOnClickListener(v1 -> {
                    String RNumber = editText.getText().toString();
                    if (!TextUtils.isEmpty(RNumber)) {
                        list.add(new RoomMode(RNumber));
                        updateRecycler(list);
                    }
                });

            }

        });


    }

    private void updateRecycler(List<RoomMode> list) {

    }


}

