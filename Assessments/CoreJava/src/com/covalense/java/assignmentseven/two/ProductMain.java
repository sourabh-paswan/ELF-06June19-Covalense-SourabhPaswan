package com.covalense.java.assignmentseven.two;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ProductMain {

	public static void main(String[] args) {
		ArrayList<Product> product = new ArrayList<Product>();
		product.add(new Product("chips", 34));
		product.add(new Product("choco", 324));
		product.add(new Product("cream", 374));
		product.add(new Product("book", 374));

		Comparator<Product> comparator = (i, j) -> {
			if (i.getCost() > j.getCost()) {
				return 1;
			} else if (i.getCost() < j.getCost()) {
				return -1;
			} else {
				return 0;
			}
		};
		List<Product> list = product.stream().sorted(comparator).collect(Collectors.toList());
		for (Product products : list) {
			log.info("details are " + products);

		}
	}

}
