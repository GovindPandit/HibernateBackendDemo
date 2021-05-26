package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Transactional
@Repository
public class ProductDAOImpl implements ProductDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addProduct(Product p) 
	{
		sessionFactory.getCurrentSession().save(p);
		return true;
	}

	@Override
	public boolean delProduct(Product p) 
	{
		sessionFactory.getCurrentSession().delete(p);
		return true;
	}

	@Override
	public boolean updProduct(Product p)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(p);
		return true;
	}

	@Override
	public List<Product> dispProducts() 
	{
		return sessionFactory.getCurrentSession().createCriteria(Product.class).list();
	}
	
}
