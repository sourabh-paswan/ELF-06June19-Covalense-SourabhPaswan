package com.covalense.java.lamdaimplimenting;

import lombok.extern.java.Log;

@Log
public class TestGender {
	public static void main(String[] args) {
		log.info(""+Gender.MALE);
		//ordinal return index
		log.info(""+Gender.FEMALE.ordinal());
		
		Gender t = Gender.FEMALE;
		
		switch(t) {
		case MALE:log.info("male");
			break;
			
		case FEMALE:log.info("female is here");
			break;
			
		case OTHER:log.info("other");
			break;
		}
	}

}
