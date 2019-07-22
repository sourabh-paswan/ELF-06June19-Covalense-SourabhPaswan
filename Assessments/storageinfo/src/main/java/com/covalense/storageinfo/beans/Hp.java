package com.covalense.storageinfo.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.storageinfo.interfaces.Laptop;
import com.covalense.storageinfo.interfaces.StorageDevices;

import lombok.Data;
import lombok.extern.java.Log;
@Log
@Data
public class Hp implements Laptop {
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
		// TODO Auto-generated method stub

	}

	@Override
	public void process() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showSpecification(String brand, int ramSize, int cost) {
		// TODO Auto-generated method stub

	}

}
