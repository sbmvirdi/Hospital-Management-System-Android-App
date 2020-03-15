package com.example.hms.ModelClass;

public class DoctorAssignedRoom {
    private long roomno,treatmentid,patientid;

    public DoctorAssignedRoom(long roomno, long treatmentid, long patientid) {
        this.roomno = roomno;
        this.treatmentid = treatmentid;
        this.patientid = patientid;
    }

    public long getRoomno() {
        return roomno;
    }

    public void setRoomno(long roomno) {
        this.roomno = roomno;
    }

    public long getTreatmentid() {
        return treatmentid;
    }

    public void setTreatmentid(long treatmentid) {
        this.treatmentid = treatmentid;
    }

    public long getPatientid() {
        return patientid;
    }

    public void setPatientid(long patientid) {
        this.patientid = patientid;
    }
}
