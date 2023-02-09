package com.Divyanshu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Divyanshu.models.Product;
import com.Divyanshu.repository.ProductRepository;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository repo;
	
	public void saveRecord(Product product) 
	{
		repo.saveProduct(product);
	}
	public List<Product> getList() 
	{
		List<Product> list=repo.getProductList();
		return list;
	}
	public Product getRecord(int pid) 
	{
		Product pp=repo.getProduct(pid);
		return pp;
	}
	public void deleteProduct(Product p) 
	{
		repo.deleteRecord(p);
	}
}
