package com.prathmesh.product.DAO;

public class Add_Product_DAO {
	
	private String product_name;
	private String quantity;
	private Float price;
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Add_Product_DAO [product_name=" + product_name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	

}
