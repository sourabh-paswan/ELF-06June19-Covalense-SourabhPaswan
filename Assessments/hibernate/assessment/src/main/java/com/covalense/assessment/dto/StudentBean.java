package com.covalense.assessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.print.attribute.SetOfIntegerSyntax;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class StudentBean implements Serializable {
	@Id
	@Column(name = "rollNum")
	private int rollNum;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private int lastName;

	@Column(name = "subject")
	private String subject;

	@Column(name = "totalMarks")
	private long totalMarks;

	
}
