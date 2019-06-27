package com.covalanse.java.jodadatetime;

import java.time.LocalDate;
import java.time.Period;

import lombok.extern.java.Log;
@Log
public class LocalTime2 {
	public static void main(String[] args) {
		LocalDate bir = LocalDate.of(1995, 02, 04);
		
		LocalDate cur = LocalDate.now();
		Period p = Period.between(bir, cur);
		log.info(""+p);
		
	}

}
