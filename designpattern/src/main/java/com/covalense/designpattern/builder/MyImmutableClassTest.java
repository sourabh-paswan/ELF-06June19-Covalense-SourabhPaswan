package com.covalense.designpattern.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) throws ParseException {
		MyImmutableClass immutableClass = null;

		immutableClass = new MyImmutableClass("ram", 23, 9810836905L);
		log.info("name: " + immutableClass.getName());
		log.info("age: " + immutableClass.getAge());
		log.info("phone: " + immutableClass.getPhone());

		immutableClass = new MyImmutableClass("ram", 23, 9810836905L);
		log.info("name: " + immutableClass.getName());
		log.info("age: " + immutableClass.getAge());
		log.info("phone: " + immutableClass.getPhone());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = format.parse("2013-03-12");

		EmployeeData data = new EmployeeData(12, "purohit", 12, "male", 1200, 14646665L, date, 8798989, "hghghgs@gmail",
				"md", date, 12, 54564);
		log.info("Id " + data.toString());

		EmployeeDataTwo data2 = new EmployeeDataTwo.EmployeeDataTwoBuilder().id(12).name("sourabh").age(25)
				.gender("male").salary(545445).phone(4665664444L).joiningDate(new Date(2017 - 12 - 12))
				.accountNo(545545).email("hjghgdxhjg@jggs").designation("md").dob(new Date(1995 - 12 - 12))
				.departmentId(12).managerId(45).build();
		log.info("Employee data2 " + data2.toString());

		EmployeeDataThree data3 = new EmployeeDataThree.EmployeeDataThreeBuilder().id(12).name("sourabh").age(25)
				.gender("male").salary(545445).phone(4665664444L).joiningDate(new Date(2017 - 12 - 12))
				.accountNo(545545).email("hjghgdxhjg@jggs").designation("md").dob(new Date(1995 - 12 - 12))
				.departmentId(12).managerId(45).build();
		log.info("Employee data3 " + data3.toString());
	}

}
