package com.covalense.springboot.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import lombok.Data;

@Entity
@Table(name = "training_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class TrainingInfoBean {
	@Id
	@Column(name = "COURSE_ID")
	private int courseId;
	@Column(name = "COURCE_NAME")
	private String collegeName;
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCourceType() {
		return courceType;
	}

	public void setCourceType(String courceType) {
		this.courceType = courceType;
	}

	public List<EmployeeInfoBean> getInfoBeans() {
		return infoBeans;
	}

	public void setInfoBeans(List<EmployeeInfoBean> infoBeans) {
		this.infoBeans = infoBeans;
	}

	@Column(name = "DURATION")
	private String duration;
	@Column(name = "COURSE_TYPE")
	private String courceType;

	//@XmlTransient
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_training", joinColumns = { @JoinColumn(name = "COURCE_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ID") })
	List<EmployeeInfoBean> infoBeans;
}
