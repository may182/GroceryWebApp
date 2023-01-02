package com.Grocery.App.controller;

import com.Grocery.App.model.Product;
import com.Grocery.App.model.User;
import com.Grocery.App.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@CrossOrigin("*")
public class ProductController {
  @Autowired
  private ProductRepository productRepo;


  //Add product to the database
  
  @PostMapping(path = "addProduct")
  public Product createUser(@RequestBody Product prod){
	  productRepo.save(prod);
      return prod;
  }
  
  @GetMapping(path = "products")
  public List<Product> displayProducts(){
    return productRepo.findAll();
  }
  

}
