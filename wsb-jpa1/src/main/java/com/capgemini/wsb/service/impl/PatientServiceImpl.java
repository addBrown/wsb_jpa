package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.repository.PatientRepository;
import com.capgemini.wsb.service.PatientService;
import com.capgemini.wsb.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public PatientTO savePatient(PatientTO patientTO) {
        PatientEntity patientEntity = PatientMapper.toPatientEntity(patientTO);
        patientEntity = patientRepository.save(patientEntity);
        return PatientMapper.toPatientTO(patientEntity);
    }

    @Override
    public List<PatientTO> getAllPatients() {
        return patientRepository.findAll()
                .stream()
                .map(PatientMapper::toPatientTO)
                .collect(Collectors.toList());
    }

    @Override
    public PatientTO getPatientById(Long id) {
        return patientRepository.findById(id)
                .map(PatientMapper::toPatientTO)
                .orElse(null);
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }
}
