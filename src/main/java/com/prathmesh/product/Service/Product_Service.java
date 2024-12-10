package com.prathmesh.product.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prathmesh.product.DAO.Add_Product_DAO;
import com.prathmesh.product.DAO.Update_Product_DAO;
import com.prathmesh.product.Repository.Product_Repository;
import com.prathmesh.product.entity.Product;

@Service
public class Product_Service {

	@Autowired
	Product_Repository product_Repository;
	
	
	public Product addProduct(Add_Product_DAO add_Product_DAO) {
		
		Product product = new Product();
		
		product.setProduct_name(add_Product_DAO.getProduct_name());
		product.setQuantity(add_Product_DAO.getQuantity());
		product.setPrice(add_Product_DAO.getPrice());
		
		product = this.product_Repository.save(product);
		
		return product;
	}
	
	public List<Product> ReadAllProduct(){
		
		List<Product> products = new ArrayList<Product>();
		
		products = this.product_Repository.findAll();
		
		return products;
	}
	
	public Product ReadById(Integer id) {
		
		Product product = new Product();
		
		product = this.product_Repository.findById(id).orElse(null);
		
		return product;
		
	}
	
	public String DeleteById(Integer id) {
		
		this.product_Repository.deleteById(id);
		
		return "Product data Deleted Successfully!!!";
		
	}
	
	public Product updateById(Integer id, Update_Product_DAO update_Product_DAO) {
		
		Product product = new Product();
		
		product = this.ReadById(id);
		
		if(update_Product_DAO.getProduct_name() != null) {
			
			product.setProduct_name(update_Product_DAO.getProduct_name());
			
		}
		
		if(update_Product_DAO.getQuantity() != null) {
			
			product.setQuantity(update_Product_DAO.getQuantity());
			
		}
		
		if(update_Product_DAO.getPrice() != null) {
			
			product.setPrice(update_Product_DAO.getPrice());
			
		}
		
		this.product_Repository.save(product);
		
		return product;
	}
	
}
