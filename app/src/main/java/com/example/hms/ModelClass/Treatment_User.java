package com.example.hms.ModelClass;

public class Treatment_User {
    private String DoctorName,Date,Complaints;
    private long amount,treatmentid;

    public Treatment_User(String doctorName, String date, String complaints, long amount, long treatmentid) {
        DoctorName = doctorName;
        Date = date;
        Complaints = complaints;
        this.amount = amount;
        this.treatmentid = treatmentid;
    }

    public Treatment_User() {
    }


    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getComplaints() {
        return Complaints;
    }

    public void setComplaints(String complaints) {
        Complaints = complaints;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getTreatmentid() {
        return treatmentid;
    }

    public void setTreatmentid(long treatmentid) {
        this.treatmentid = treatmentid;
    }
}
