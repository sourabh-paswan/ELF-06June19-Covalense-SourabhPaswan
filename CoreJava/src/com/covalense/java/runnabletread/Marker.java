package com.covalense.java.runnabletread;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable {
	@Override
	public void run() {
		log.info("run in marker");
		for(int i=0;i<5;i++) {
			log.info(""+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
