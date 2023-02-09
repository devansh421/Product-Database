package com.Divyanshu.repository;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Divyanshu.models.Product;

@Repository
public class ProductRepository 
{
	Session ses;
	Transaction t;
	
	@Autowired
	public ProductRepository(SessionFactory factory)
	{
		ses=factory.openSession();
		t=ses.getTransaction();
	}
	public void saveProduct(Product product) 
	{
		t.begin();
		ses.save(product);
		t.commit();
	}
	public List<Product> getProductList() 
	{
		Query<Product> q=ses.createQuery("from Product");
		List<Product> plist=q.list();
		return plist;
	}
	public Product getProduct(int pid) 
	{
		Product pr=ses.get(Product.class,pid);
		return pr;
	}
	public void deleteRecord(Product p) 
	{
		t.begin();
		ses.delete(p);
		t.commit();
	}
}
