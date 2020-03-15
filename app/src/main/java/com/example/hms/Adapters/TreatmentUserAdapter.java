package com.example.hms.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hms.ModelClass.Treatment_User;
import com.example.hms.R;

import java.util.List;

public class TreatmentUserAdapter extends RecyclerView.Adapter<TreatmentUserAdapter.MyViewHolder> {
    private List<Treatment_User> mList;
    private Context context;

    public TreatmentUserAdapter(List<Treatment_User> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.treatment_user_model,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.setData(mList.get(position).getTreatmentid(),mList.get(position).getDoctorName(),mList.get(position).getComplaints(),mList.get(position).getAmount());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder{

        private TextView treatmentid,doctorname,complaints,amount;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            treatmentid = itemView.findViewById(R.id.treatmentid);
            amount = itemView.findViewById(R.id.amount);
            doctorname = itemView.findViewById(R.id.doctorname);
            complaints = itemView.findViewById(R.id.complaints);

        }

        private void setData(long treatmentid,String doctorname,String complaints,long amount){
            this.treatmentid.setText(treatmentid+"");
            this.doctorname.setText(doctorname);
            this.complaints.setText(complaints);
            this.amount.setText(amount+" INR");
        }
    }
}
