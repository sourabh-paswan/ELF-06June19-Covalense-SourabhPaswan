package com.covalense.java.loger;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BuyProduct {
	private static final Logger Loger= Logger.getLogger("sourabh");
	
	
	void buy()
	{
		
	Loger.log(Level.SEVERE,"i am severe");
	Loger.log(Level.WARNING,"i am warning");
	Loger.log(Level.INFO,"i am info");
	Loger.log(Level.CONFIG,"i am CONFIG");
	Loger.log(Level.FINE,"i am FINE");
	Loger.log(Level.FINER,"i am FINER");
	Loger.log(Level.FINEST,"i am FINEST");
	}
}
