package com.capgemini.wsb.persistence.entity;

import com.capgemini.wsb.persistence.entity.VisitEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MedicalTreatmentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;
	private String type;

	@OneToMany(mappedBy = "medicalTreatment", cascade = CascadeType.ALL)
	private Set<VisitEntity> visits;

	// Getters and Setters
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<VisitEntity> getVisits() {
		return visits;
	}

	public void setVisits(Set<VisitEntity> visits) {
		this.visits = visits;
	}
}
