package com.covalense.assessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class ProductsBean implements Serializable {
	@Id
	@Column(name = "productID")
	private int productID;

	@Column(name = "productName")
	private String productName;

	@Column(name = "price")
	private double price;

	@Column(name = "colour")
	private String colour;

	@Column(name = "weight")
	private double weight;

}
