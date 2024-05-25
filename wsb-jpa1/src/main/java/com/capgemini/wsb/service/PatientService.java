package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;

import java.util.List;

public interface PatientService {
    PatientTO getPatientById(Long id);
    List<PatientTO> getAllPatients();
    PatientTO savePatient(PatientTO patientTO);
    void deletePatientById(Long id);
}