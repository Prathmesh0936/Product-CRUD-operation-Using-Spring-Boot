package com.prathmesh.product.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prathmesh.product.DAO.Add_Product_DAO;
import com.prathmesh.product.DAO.Update_Product_DAO;
import com.prathmesh.product.Service.Product_Service;

@Controller
@RequestMapping("/products")
public class Product_Controller {

	@Autowired
	Product_Service product_Service;
	
	@PostMapping("")
	public ResponseEntity<?> AddProduct(@RequestBody Add_Product_DAO add_Product_DAO){
		
		return ResponseEntity.ok(this.product_Service.addProduct(add_Product_DAO));
		
	}
	
	@GetMapping("")
	public ResponseEntity<?> ViewAllproducts(){
		
		return ResponseEntity.ok(this.product_Service.ReadAllProduct());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> ViewById(@PathVariable Integer id){
		
		return ResponseEntity.ok(this.product_Service.ReadById(id));
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> DeleteById(@PathVariable Integer id){
		
		return ResponseEntity.ok(this.product_Service.DeleteById(id));
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> UpdateById(@PathVariable Integer id, @RequestBody Update_Product_DAO update_Product_DAO){
		
		return ResponseEntity.ok(this.product_Service.updateById(id, update_Product_DAO));
		
	}
}
