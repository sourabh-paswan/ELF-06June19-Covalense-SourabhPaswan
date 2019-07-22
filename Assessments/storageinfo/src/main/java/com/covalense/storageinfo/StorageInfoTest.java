package com.covalense.storageinfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.storageinfo.beans.Dell;
import com.covalense.storageinfo.beans.Hp;
import com.covalense.storageinfo.interfaces.Laptop;

public class StorageInfoTest {

	public static void main(String[] args) {
		Laptop dell = new Dell();
		Laptop hp = new Hp();
		
		//invoke all the methods (including storage device and Laptop interface ,methods)

	}

}
