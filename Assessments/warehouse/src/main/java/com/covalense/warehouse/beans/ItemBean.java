package com.covalense.warehouse.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "items")
public class ItemBean {

	@Id
	@Column(name = "item_id")
	private int id;

	@Column(name = "item_name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "cost")
	private int cost;
	@Column(name = "quantity")
	private int quantity;

}
