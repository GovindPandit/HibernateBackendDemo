package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prodID;
	
	@Column
	private String prodName;
	private float prodPrice;
	private String prodDesc;
	
	public Product(String prodName, float prodPrice, String prodDesc) {
		super();
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodDesc = prodDesc;
	}

	
	public Product() {
		super();
	}


	public int getProdID() {
		return prodID;
	}

	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public float getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	
	
	
}
