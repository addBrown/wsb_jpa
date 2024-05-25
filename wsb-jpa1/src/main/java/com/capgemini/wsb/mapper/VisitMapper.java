package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.mapper.DoctorMapper;
import com.capgemini.wsb.persistence.entity.VisitEntity;

public class VisitMapper {

    public static VisitTO toVisitTO(VisitEntity visitEntity) {
        return new VisitTO(
                visitEntity.getId(),
                visitEntity.getDescription(),
                visitEntity.getTime(),
                DoctorMapper.toDoctorTO(visitEntity.getDoctor()),
                PatientMapper.toPatientTO(visitEntity.getPatient())
        );
    }
}
