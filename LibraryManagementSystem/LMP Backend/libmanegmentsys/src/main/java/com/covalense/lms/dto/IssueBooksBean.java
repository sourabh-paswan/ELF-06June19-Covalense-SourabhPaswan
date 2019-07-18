package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "isuue_info")
public class IssueBooksBean implements Serializable {

	@Id
	@Column(name = "userId")
	private Integer userId;

	@Column(name = "bookId")
	private Integer bookId;

	@Column(name = "issueDate")
	private Date issueDate;

	@Column(name = "noOfDays")
	private Integer noOfDays;

}
