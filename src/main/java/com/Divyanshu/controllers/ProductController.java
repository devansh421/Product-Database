package com.Divyanshu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Divyanshu.models.Product;
import com.Divyanshu.services.ProductService;

@Controller
public class ProductController 
{
	@Autowired 
	private ProductService service;
	
	@RequestMapping("/")
	public String getInsertView()
	{
		return "insert";
	}
	@RequestMapping("save")
	public String saveProductRecord(Product product)
	{
		service.saveRecord(product);
		return "save";
	}
	@RequestMapping("list")
	public String getProductList(Model model)
	{
		List<Product> list=service.getList();
		model.addAttribute("plist",list);
		return "product-list";
	}
	@RequestMapping("search")
	public String getSearchProductView()
	{
		return "search-product";
	}
	@RequestMapping("show")
	public String getProductRecord(int pid,Model model)
	{
		Product p=service.getRecord(pid);
		if(p==null)
		{
			model.addAttribute("msg","Product with id "+pid+" not found");
			return "search-product";
		}
		model.addAttribute("product",p);
		return "show-product";
	}
	@RequestMapping("delete")
	public String getDeleteProductView()
	{
		return "delete-product";
	}
	@RequestMapping("delete-record")
	public String deleteProductRecord(int pid,Model model)
	{
		Product p=service.getRecord(pid);
		if(p==null)
		{
			model.addAttribute("msg","Product with id "+pid+" does not exist");
			return "delete-product";
		}
		service.deleteProduct(p);
		return "delete";
	}
}
