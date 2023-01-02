package com.Grocery.App.service;

//import com.Grocery.App.model.Cart;
import com.Grocery.App.model.Product;

public interface CartService {
	public int addToCart(Product product,int quantity);
	public int deleteFromCart(Product product);
	public int modifyCartQuantity(Product product,int quantity);
}
