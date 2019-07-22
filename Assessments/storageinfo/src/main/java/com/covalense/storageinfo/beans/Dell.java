package com.covalense.storageinfo.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.storageinfo.interfaces.Laptop;
import com.covalense.storageinfo.interfaces.StorageDevices;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class Dell implements Laptop {
	public String brand;
	public String color;
	public int cost;
	public int weight;
	public int ram;
	public String os;
	@Autowired
	public StorageDevices storageDevice;

	@Override
	public void display() {
		log.info("display() in Dell");
	}

	@Override
	public void process() {
		log.info("process() in Dell");
	}

	@Override
	public void showSpecification(String brand, int ramSize, int cost) {
	}

}
