package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.DoctorTO;
import com.capgemini.wsb.persistence.entity.DoctorEntity;

public class DoctorMapper {

    public static DoctorTO toDoctorTO(DoctorEntity doctorEntity) {
        return new DoctorTO(
                doctorEntity.getId(),
                doctorEntity.getFirstName(),
                doctorEntity.getLastName(),
                doctorEntity.getTelephoneNumber(),
                doctorEntity.getEmail(),
                doctorEntity.getDoctorNumber(),
                doctorEntity.getSpecialization()
        );
    }
}
