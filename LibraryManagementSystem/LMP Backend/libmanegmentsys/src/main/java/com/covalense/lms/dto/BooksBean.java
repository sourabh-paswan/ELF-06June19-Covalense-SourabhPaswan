package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "books_info")
public class BooksBean implements Serializable {
	@Id
	@Column(name = "userId")
	private Integer bookId;

	@Column(name = "bookName")
	private String bookName;

	@Column(name = "bookCatogery")
	private String bookCatogery;

	@Column(name = "author")
	private String author;

	@Column(name = "publisher")
	private String publisher;

	@Column(name = "copyright")
	private Long copyright;

	@Column(name = "edition")
	private Double edition;

	@Column(name = "totalIssuedNo")
	private Integer totalIssuedNo;

	@Column(name = "totalNo")
	private Integer totalNo;

	@Column(name = "isAvailable")
	private Boolean isAvailable;

	@Column(name = "shelfNo")
	private Date shelfNo;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookCatogery() {
		return bookCatogery;
	}

	public void setBookCatogery(String bookCatogery) {
		this.bookCatogery = bookCatogery;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Long getCopyright() {
		return copyright;
	}

	public void setCopyright(Long copyright) {
		this.copyright = copyright;
	}

	public Double getEdition() {
		return edition;
	}

	public void setEdition(Double edition) {
		this.edition = edition;
	}

	public Integer getTotalIssuedNo() {
		return totalIssuedNo;
	}

	public void setTotalIssuedNo(Integer totalIssuedNo) {
		this.totalIssuedNo = totalIssuedNo;
	}

	public Integer getTotalNo() {
		return totalNo;
	}

	public void setTotalNo(Integer totalNo) {
		this.totalNo = totalNo;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Date getShelfNo() {
		return shelfNo;
	}

	public void setShelfNo(Date shelfNo) {
		this.shelfNo = shelfNo;
	}

}
