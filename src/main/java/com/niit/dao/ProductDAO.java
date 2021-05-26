package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO 
{
	public boolean addProduct(Product p);
	public boolean delProduct(Product p);
	public boolean updProduct(Product p);
	public List<Product> dispProducts(); 
}
