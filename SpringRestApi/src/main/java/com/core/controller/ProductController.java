package com.core.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.core.entity.Product;
import com.core.service.ProductServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class ProductController {
	
	@Autowired
	ProductServices productservies;
	
	@GetMapping("/getAllProduct")
	public ArrayList<Product> getAllProduct(){
		
		ArrayList<Product> plist = productservies.getAllProduct();
		
		return plist;
		
	}
	
	@GetMapping("/getCategoryProduct")
	public ArrayList<Product> getCategoryProduct(){
		
		ArrayList<Product> clist = productservies.getCategoryProduct();
		
		return clist;
		
	}
	
	@RequestMapping("/getProductMax")
	public ArrayList<Product> getMaxProduct(){
		
		ArrayList<Product> pmax = productservies.getMaxProduct();
		
		return pmax;
		
	}
	
	@RequestMapping("/getProductMin")
	public ArrayList<Product> getMinProduct(){
		
		ArrayList<Product> pmin = productservies.getMinProduct();
		
		return pmin;
		
	}
	
	
	@RequestMapping("/getProductTotal")
	public String getAllPrice() {
		long total = productservies.getAllPrice();
		
		
		return "Total Price of Product = "+total;
		
	}
	
	@GetMapping("/getAllExceptStationary")
	public ArrayList<Product> getAllExceptStationary(){
		
		ArrayList<Product> plist = productservies.getAllExceptStationary();
		
		return plist;
	}
	
	
	@GetMapping("/getProductGreater")
	public ArrayList<Product> getProductGreater(){
		ArrayList<Product> plist = productservies.getProductGreater();
		
		return plist;
	}
	
	
	@GetMapping("/getProductByL")
	public ArrayList<Product> getProductByL(){
		ArrayList<Product> plist = productservies.getProductByL();
		return plist;
	}
	
	@GetMapping("/getPriceWithQutantity")
	public ArrayList<Long> getPriceWithQutantity(){
		ArrayList<Long> total = productservies.getPriceWithQutantity();
		return total;
	}

}
