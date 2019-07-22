package com.covalense.java.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	@Override
	public void run() {
		String s= getName();
		log.info(""+s);
		for(int i=0;i<4;i++) {
			log.info(""+i);
		}
		log.info("logic");
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
