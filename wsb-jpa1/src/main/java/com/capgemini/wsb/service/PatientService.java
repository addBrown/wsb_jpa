package com.capgemini.wsb.service;

import com.capgemini.wsb.persistence.entity.PatientEntity;

import java.util.List;

public interface PatientService {
    List<PatientEntity> getAllPatients();
    PatientEntity getPatientById(Long id);
    PatientEntity savePatient(PatientEntity patient);
    void deletePatient(Long id);
}
