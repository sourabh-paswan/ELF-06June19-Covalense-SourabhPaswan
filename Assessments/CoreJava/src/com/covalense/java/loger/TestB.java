package com.covalense.java.loger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestB {
	private static final Logger Loger= Logger.getLogger("sourabh");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Loger.setLevel(Level.ALL);
		
				try {
					FileHandler f = new FileHandler("myfavlogDATA.log",true);
					f.setLevel(Level.FINE);
					f.setFormatter(new SimpleFormatter());
					Loger.addHandler(f);
					
					BuyProduct b= new BuyProduct();
					b.buy();
					System.out.println("done");
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			
			
			
			
		}

	}


