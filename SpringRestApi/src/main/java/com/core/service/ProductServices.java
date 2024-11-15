package com.core.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.ProductDao;
import com.core.entity.Product;

@Service
public class ProductServices {

	@Autowired
	ProductDao productdao;

	public ArrayList<Product> getAllProduct() {

		ArrayList<Product> plist = productdao.getAllProduct();
		return plist;
	}

	public ArrayList<Product> getCategoryProduct() {

		ArrayList<Product> plist = productdao.getAllProduct();
		ArrayList<Product> filterlsit = new ArrayList<Product>();

		for (Product p : plist) {
			if (p.getCategory().equals("Electronics")) {
				filterlsit.add(p);
			}
		}

		return filterlsit;

	}

	public ArrayList<Product> getMaxProduct() {

		ArrayList<Product> plist = productdao.getAllProduct();
		ArrayList<Product> pmax = new ArrayList<Product>();

		int max = 0;

		for (Product p : plist) {
			if (p.getPprice() > max) {
				max = p.getPprice();
			}
		}

		for (Product p : plist) {
			if (p.getPprice() == max) {
				pmax.add(p);
			}
		}

		return pmax;
	}

	public ArrayList<Product> getMinProduct() {

		ArrayList<Product> plist = productdao.getAllProduct();
		ArrayList<Product> pmin = new ArrayList<Product>();

		int min = Integer.MAX_VALUE;

		for (Product p : plist) {
			if (p.getPprice() < min) {
				min = p.getPprice();
			}
		}

		for (Product p : plist) {
			if (p.getPprice() == min) {
				pmin.add(p);
			}
		}

		return pmin;
	}

	public long getAllPrice() {

		ArrayList<Product> plist = productdao.getAllProduct();

		long total = 0;
		for (Product p : plist) {
			total += p.getPprice();
		}

		return total;

	}

	public ArrayList<Product> getAllExceptStationary() {

		ArrayList<Product> plist = productdao.getAllProduct();
		ArrayList<Product> pro = new ArrayList<Product>();

		for (Product p : plist) {
			if (p.getCategory() != "Stationary") {
				pro.add(p);
			}
		}

		return pro;

	}
	
	public ArrayList<Product> getProductGreater(){
		
		ArrayList<Product> plist = productdao.getAllProduct();
		ArrayList<Product> p1 = new ArrayList<Product>();
		
		for(Product p : plist) {
			if(p.getPprice()>12000) {
				p1.add(p);
			}
		}
		
		return p1;
		
	}
	
	public ArrayList<Product> getProductByL(){
		ArrayList<Product> plist = productdao.getAllProduct();
		ArrayList<Product> p1 = new ArrayList<Product>();
		
		for(Product p : plist) {
			String s =p.getPname();
			if(s.charAt(0)=='L') {
				p1.add(p);
			}
		}
		
		return p1;
	}
	
	public ArrayList<Long> getPriceWithQutantity(){
		ArrayList<Product> plist = productdao.getAllProduct();
		ArrayList<Long> p1 = new ArrayList<>();
		
		for(Product p : plist) {
			Long total = (long) (p.getPprice()*p.getPqty());
			p1.add(total);
		}
		return p1;
	}

}
