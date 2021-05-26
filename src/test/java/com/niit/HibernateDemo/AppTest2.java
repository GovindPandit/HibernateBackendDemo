package com.niit.HibernateDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.config.AppConfig;
import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class AppTest2 
{
	@Autowired ProductDAO pdao;
	
	@Test
	@Ignore
	public void testAddProd()
	{
		assertEquals(true, pdao.addProduct(new Product("iPhone", 50000.0f, "Mobile phone")));
	}
	
	@Test
	@Ignore
	public void testUpdProd()
	{
		Product p = new Product("Iphone x", 55000.0f, "Mobile Phone");
		p.setProdID(1);
		
		assertEquals(true, pdao.updProduct(p));
	}
	
	@Test
	@Ignore
	public void testDelProd()
	{
		Product p = new Product();
		p.setProdID(1);
		
		assertEquals(true, pdao.delProduct(p));
	}
	
	@Test
	public void testDispProd()
	{
		assertNotEquals(null, pdao.dispProducts());
	}
}
