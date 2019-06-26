package com.covalense.java.lamdaimplimenting;

public class MarkerLamda  {
	public static void main(String[] args) {
		
		Runnable x = ()->{
			for(int i=0; i<5;i++) {
				System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(x);
		t1.start();
		
		Thread t2 = new Thread(x);
		t2.start();
		
	}

}
