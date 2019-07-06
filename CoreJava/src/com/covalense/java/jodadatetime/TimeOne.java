package com.covalense.java.jodadatetime;

import java.time.LocalDate;

import lombok.extern.java.Log;


@Log
public class TimeOne {
	public static void main(String[] args) {
		LocalDate d  = LocalDate.now();
		log.info(""+d.getMonthValue());
		
		
	}

}
