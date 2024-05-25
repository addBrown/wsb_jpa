package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import java.util.stream.Collectors;

public class PatientMapper {

    public static PatientTO toPatientTO(PatientEntity patientEntity) {
        return new PatientTO(
                patientEntity.getId(),
                patientEntity.getFirstName(),
                patientEntity.getLastName(),
                patientEntity.getTelephoneNumber(),
                patientEntity.getEmail(),
                patientEntity.getPatientNumber(),
                patientEntity.getDateOfBirth(),
                patientEntity.getAge(),
                patientEntity.getVisits() != null ?
                        patientEntity.getVisits().stream().map(VisitMapper::toVisitTO).collect(Collectors.toList())
                        : null
        );
    }

    public static PatientEntity toPatientEntity(PatientTO patientTO) {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientTO.getId());
        patientEntity.setFirstName(patientTO.getFirstName());
        patientEntity.setLastName(patientTO.getLastName());
        patientEntity.setTelephoneNumber(patientTO.getTelephoneNumber());
        patientEntity.setEmail(patientTO.getEmail());
        patientEntity.setPatientNumber(patientTO.getPatientNumber());
        patientEntity.setDateOfBirth(patientTO.getDateOfBirth());
        patientEntity.setAge(patientTO.getAge());
        // Set visits if needed
        return patientEntity;
    }
}
