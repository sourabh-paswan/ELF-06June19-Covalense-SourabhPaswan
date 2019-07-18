package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
@JsonRootName(value = "users_info")
@Entity
@Table(name = "users_info")
public class UsersBean implements Serializable {
	@Id
	@Column(name = "userId" )
	private Integer userId;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="userType")
	private String userType;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="password")
	private String password;
	
	@Column(name ="phone")
	private Long phone;
	
	@Column(name ="havingBooks")
	private Integer havingBooks;
	
	@Column(name ="freeMember")
	private Boolean freeMember;
	
	@Column(name ="membershipFeeDues")
	private Double membershipFeeDues;
	
	@Column(name ="fineDues")
	private Double fineDues;
	
	@Column(name ="membershipJoiningDate")
	private Date membershipJoiningDate;
	
	@Column(name ="membershipExpiredDate")
	private Date membershipExpiredDate;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Integer getHavingBooks() {
		return havingBooks;
	}

	public void setHavingBooks(Integer havingBooks) {
		this.havingBooks = havingBooks;
	}

	public Boolean getFreeMember() {
		return freeMember;
	}

	public void setFreeMember(Boolean freeMember) {
		this.freeMember = freeMember;
	}

	public Double getMembershipFeeDues() {
		return membershipFeeDues;
	}

	public void setMembershipFeeDues(Double membershipFeeDues) {
		this.membershipFeeDues = membershipFeeDues;
	}

	public Double getFineDues() {
		return fineDues;
	}

	public void setFineDues(Double fineDues) {
		this.fineDues = fineDues;
	}

	public Date getMembershipJoiningDate() {
		return membershipJoiningDate;
	}

	public void setMembershipJoiningDate(Date membershipJoiningDate) {
		this.membershipJoiningDate = membershipJoiningDate;
	}

	public Date getMembershipExpiredDate() {
		return membershipExpiredDate;
	}

	public void setMembershipExpiredDate(Date membershipExpiredDate) {
		this.membershipExpiredDate = membershipExpiredDate;
	}

}
