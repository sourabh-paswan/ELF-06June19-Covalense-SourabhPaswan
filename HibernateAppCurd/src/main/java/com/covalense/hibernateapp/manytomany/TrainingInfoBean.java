package com.covalense.hibernateapp.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name = "training_info")
public class TrainingInfoBean {
	@Id
	@Column(name = "COURSE_ID")
	private int courseId;
	@Column(name = "COURCE_NAME")
	private String collegeName;
	@Column(name = "DURATION")
	private String duration;
	@Column(name = "COURSE_TYPE")
	private String courceType;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_training", joinColumns = { @JoinColumn(name = "COURCE_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ID") })
	List<EmployeeInfoBean> infoBeans;
}
