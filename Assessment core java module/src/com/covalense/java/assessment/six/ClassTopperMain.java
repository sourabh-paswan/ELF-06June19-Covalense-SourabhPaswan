package com.covalense.java.assessment.six;

import java.util.logging.Logger;

/*Test case: WAP to find the female and male topper of the class. 
 * (Using Lambda and Stream)*/

public class ClassTopperMain {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("ClassTopperMain");

		Student male = new Student();
		Student female = new Student();

		ClassRoom cr = highmarks -> {
			if (highmarks == 100) {
				return male;
			}
			return female;
		};

		Student topper = cr.topper(100);
		log.info("" + topper);
	}

}
