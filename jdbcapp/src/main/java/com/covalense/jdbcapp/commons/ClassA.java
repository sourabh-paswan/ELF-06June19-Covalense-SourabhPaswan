package com.covalense.jdbcapp.commons;

import lombok.extern.java.Log;

@Log
public class ClassA implements Connection {
  public void printMessage() {
	  log.info("print AAA");
  }
	

}
