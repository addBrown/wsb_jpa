package com.capgemini.wsb.persistance.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.repository.PatientRepository;
import com.capgemini.wsb.service.PatientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;

    private PatientTO patientTO;

    @BeforeEach
    void setUp() {
        patientRepository.deleteAll();

        patientTO = new PatientTO();
        patientTO.setFirstName("John");
        patientTO.setLastName("Doe");
        patientTO.setTelephoneNumber("123456789");
        patientTO.setEmail("john.doe@example.com");
        patientTO.setPatientNumber("P12345");
        patientTO.setDateOfBirth(new Date());
        patientTO.setAge(30);
    }

    @Test
    void testSavePatient() {
        PatientTO savedPatient = patientService.savePatient(patientTO);

        assertNotNull(savedPatient);
        assertEquals("John", savedPatient.getFirstName());

        List<PatientEntity> patients = patientRepository.findAll();
        assertEquals(1, patients.size());
        assertEquals("John", patients.get(0).getFirstName());
    }

    @Test
    void testGetAllPatients() {
        patientService.savePatient(patientTO);
        List<PatientTO> patients = patientService.getAllPatients();

        assertNotNull(patients);
        assertEquals(1, patients.size());
        assertEquals("John", patients.get(0).getFirstName());
    }

    @Test
    void testGetPatientById() {
        PatientTO savedPatient = patientService.savePatient(patientTO);
        PatientTO foundPatient = patientService.getPatientById(savedPatient.getId());

        assertNotNull(foundPatient);
        assertEquals("John", foundPatient.getFirstName());
    }

    @Test
    void testDeletePatientById() {
        PatientTO savedPatient = patientService.savePatient(patientTO);
        patientService.deletePatientById(savedPatient.getId());

        List<PatientEntity> patients = patientRepository.findAll();
        assertTrue(patients.isEmpty());
    }
}
