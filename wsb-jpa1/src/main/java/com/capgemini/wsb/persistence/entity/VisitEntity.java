package com.capgemini.wsb.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "visit_entity")
public class VisitEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;
	private Timestamp time;

	@ManyToOne
	@JoinColumn(name = "doctor_id", nullable = false)
	private DoctorEntity doctor;

	@ManyToOne
	@JoinColumn(name = "patient_id", nullable = false)
	private PatientEntity patient;

	@ManyToOne
	@JoinColumn(name = "medical_treatment_id", nullable = false)
	private MedicalTreatmentEntity medicalTreatment;

	public VisitEntity() {}

	public VisitEntity(Long id, String description, Timestamp time, DoctorEntity doctor, PatientEntity patient, MedicalTreatmentEntity medicalTreatment) {
		this.id = id;
		this.description = description;
		this.time = time;
		this.doctor = doctor;
		this.patient = patient;
		this.medicalTreatment = medicalTreatment;
	}


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

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public MedicalTreatmentEntity getMedicalTreatment() {
		return medicalTreatment;
	}

	public void setMedicalTreatment(MedicalTreatmentEntity medicalTreatment) {
		this.medicalTreatment = medicalTreatment;
	}
}
