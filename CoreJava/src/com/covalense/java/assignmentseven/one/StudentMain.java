package com.covalense.java.assignmentseven.one;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setId(10);
		student1.setName("ramesh");
		student1.setPercent(65.52);

		Student student2 = new Student();
		student2.setId(12);
		student2.setName("suresh");
		student2.setPercent(75.52);

		Student student3 = new Student();
		student3.setId(13);
		student3.setName("rohit");
		student3.setPercent(85.52);

		Student student4 = new Student();
		student4.setId(15);
		student4.setName("ritu");
		student4.setPercent(85.52);

		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);

		Comparator<Student> com = (i, j) -> {
			if (i.getId() > j.getId()) {
				return 1;
			} else if (i.getId() < j.getId()) {
				return -1;
			} else {
				return 0;
			}
		};

		List<Student> list = student.stream().sorted(com).collect(Collectors.toList());
		for (Student studentres : list) {
			log.info("details are " + studentres);

		}
	}

}
