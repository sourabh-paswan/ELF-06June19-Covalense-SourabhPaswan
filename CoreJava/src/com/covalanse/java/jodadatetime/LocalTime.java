package com.covalanse.java.jodadatetime;

import java.time.LocalDateTime;

import lombok.extern.java.Log;
@Log
public class LocalTime {
	public static void main(String[] args) {
		LocalDateTime d= LocalDateTime.now();
		log.info(""+d.getDayOfMonth());
		log.info(""+d.getDayOfYear());
		
	}

}
