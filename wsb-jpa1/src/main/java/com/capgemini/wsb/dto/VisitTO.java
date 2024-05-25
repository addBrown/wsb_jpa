package com.capgemini.wsb.dto;

import java.sql.Timestamp;

public class VisitTO {
    private Long id;
    private String description;
    private Timestamp time;
    private DoctorTO doctor;
    private PatientTO patient;

    public VisitTO() {
    }

    public VisitTO(Long id, String description, Timestamp time, DoctorTO doctor, PatientTO patient) {
        this.id = id;
        this.description = description;
        this.time = time;
        this.doctor = doctor;
        this.patient = patient;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public DoctorTO getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorTO doctor) {
        this.doctor = doctor;
    }

    public PatientTO getPatient() {
        return patient;
    }

    public void setPatient(PatientTO patient) {
        this.patient = patient;
    }
}
