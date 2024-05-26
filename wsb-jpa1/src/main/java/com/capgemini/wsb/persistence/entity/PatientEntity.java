package com.capgemini.wsb.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "patient_entity")
public class PatientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;
	private String lastName;
	private String telephoneNumber;
	private String email;
	private String patientNumber;
	private Date dateOfBirth;
	private int age;

	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private Set<VisitEntity> visits = new HashSet<>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private AddressEntity address;

	public PatientEntity(Long id, String firstName, String lastName, String telephoneNumber, String email, String patientNumber, Date dateOfBirth, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
		this.patientNumber = patientNumber;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}

	public PatientEntity() {
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Set<VisitEntity> getVisits() {
		return visits;
	}

	public void setVisits(Set<VisitEntity> visits) {
		this.visits = visits;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
