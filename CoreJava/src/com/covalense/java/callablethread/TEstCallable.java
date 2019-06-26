package com.covalense.java.callablethread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TEstCallable {
	public static void main(String[] args) {
		Pencil p1 = new Pencil();
		FutureTask<Integer> ft = new FutureTask<Integer>(p1);
		
		Thread t1 = new Thread(ft);
		t1.start();
		
		int i;
		try {
			i = ft.get();
			System.out.println("value is "+i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}

}
