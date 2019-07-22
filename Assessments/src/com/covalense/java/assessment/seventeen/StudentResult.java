package com.covalense.java.assessment.seventeen;

import java.util.logging.Logger;

/*WAP to return true of students is passed else false, 
 *using lambda expression*/

//solution

public class StudentResult {
	public static void main(String[] args) {
		Logger log = Logger.getLogger("StudentResult");

		Student s = marks -> {
			if (marks > 30) {
				return true;
			} else {
				return false;
			}
		};

		boolean b = s.pass(40);
		log.info("result is " + b);
	}

}
