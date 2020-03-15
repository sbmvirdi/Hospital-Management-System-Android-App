package com.example.hms.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hms.R;

import java.util.List;

public class DoctorAssignedRoom extends RecyclerView.Adapter<DoctorAssignedRoom.MyViewHolder>{

    private Context context;
    private List<com.example.hms.ModelClass.DoctorAssignedRoom> list;

    public DoctorAssignedRoom(Context context, List<com.example.hms.ModelClass.DoctorAssignedRoom> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.doctor_row_prescription,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.setData(list.get(position).getPatientid(),list.get(position).getRoomno(),list.get(position).getTreatmentid());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder{
        private TextView roomNumberID,patientID,treatmentID;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            roomNumberID = itemView.findViewById(R.id.roomNumberID);
            patientID = itemView.findViewById(R.id.patientID);
            treatmentID = itemView.findViewById(R.id.treatmentID);

        }

        private void setData(long patientid,long roomid,long treatmentid){
            roomNumberID.setText(roomid+"");
            patientID.setText(patientid+"");
            treatmentID.setText(treatmentid+"");
        }

    }
}
