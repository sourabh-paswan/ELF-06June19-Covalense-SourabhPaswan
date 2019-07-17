package com.covalense.assessment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="test")
public class TestTableBean {
	@Id
	@Column(name = "Id")
	private int Id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "city")
	private String city;

	
}
