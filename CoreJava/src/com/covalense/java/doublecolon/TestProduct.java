package com.covalense.java.doublecolon;

import lombok.extern.java.Log;

@Log
public class TestProduct {
	public static void main(String[] args) {
		ProductInterface tp = Product :: new;
		Product p = tp.getProduct("box", 2);
		
		log.info("name is "+p.name);
		log.info("cost is "+p.cost);
	}

}
