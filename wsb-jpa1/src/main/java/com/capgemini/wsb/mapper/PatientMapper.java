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
                patientEntity.getVisits().stream().map(VisitMapper::toVisitTO).collect(Collectors.toList())
        );
    }

    public static PatientEntity toPatientEntity(PatientTO patientTO) {
        return new PatientEntity(
                patientTO.getId(),
                patientTO.getFirstName(),
                patientTO.getLastName(),
                patientTO.getTelephoneNumber(),
                patientTO.getEmail(),
                patientTO.getPatientNumber(),
                patientTO.getDateOfBirth(),
                patientTO.getAge() // New field
        );
    }
}
