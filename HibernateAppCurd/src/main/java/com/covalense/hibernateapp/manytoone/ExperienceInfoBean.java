package com.covalense.hibernateapp.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "employee_experience_info")
@ToString
public class ExperienceInfoBean implements Serializable {
	@EmbeddedId
	private ExperiencePKBean experienceInfoBean;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	@Column(name = "LEAVING_DATE")
	private Date leavingDate;
}
