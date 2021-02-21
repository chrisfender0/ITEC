package com.itec.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itec.pojo.Products;

@Service
public class ProductDisplayHelper {

	public static List<Products> displayProducts(String productType, List<Products> prods){
		if(productType.equalsIgnoreCase("all")) {
			System.out.println(prods.toString());
			return prods;
		} else {
			List<Products> filteredProds = new ArrayList<Products>();
			for (Products products : prods) {
				if(products.getType().equalsIgnoreCase(productType)) {
					System.out.println(products.getName());
					filteredProds.add(products);
				}
			}
			System.out.println(filteredProds.toString());
			return filteredProds;
		}
		
	}
}
