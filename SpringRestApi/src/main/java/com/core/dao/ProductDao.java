package com.core.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.core.entity.Product;

@Repository
public class ProductDao {
	
	public ArrayList<Product> getAllProduct(){
		
		ArrayList<Product> plist = new ArrayList<Product>();
		
		plist.add(new Product(1211,"Laptop",300,45000,"Electronics"));
		plist.add(new Product(4325,"Pen",30,100,"Stationary"));
		plist.add(new Product(1234,"Mobile",150,80000,"Electronics"));
		plist.add(new Product(456,"Notebook",40,200,"Stationary"));
		plist.add(new Product(567,"Chair",20,1500,"Furniture"));
		plist.add(new Product(678,"Mouse",3,450,"Electronics"));
		
		return plist;
		
	}

}
