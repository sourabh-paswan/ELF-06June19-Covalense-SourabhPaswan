package com.covalense.storageinfo.beans;

import com.covalense.storageinfo.interfaces.StorageDevices;

import lombok.Data;
import lombok.extern.java.Log;
@Log
@Data
public class PenDrive implements StorageDevices {

	public String capacity;
	public String writtingSpeed;
	public String readingSpeed;

	@Override
	public void write() {
		log.info("write() in Dell");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub

	}

	@Override
	public void format() {
		// TODO Auto-generated method stub

	}

}
