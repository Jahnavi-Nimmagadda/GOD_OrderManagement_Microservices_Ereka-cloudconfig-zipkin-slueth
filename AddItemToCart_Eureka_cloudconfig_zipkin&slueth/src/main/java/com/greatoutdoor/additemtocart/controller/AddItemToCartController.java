package com.greatoutdoor.additemtocart.controller;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatoutdoor.additemtocart.entities.CartDTO;

import com.greatoutdoor.additemtocart.service.AddItemToCartServiceImpl;



@RestController
@RequestMapping("/Cart")
@CrossOrigin("http://localhost:4200")
public class AddItemToCartController {
	
	@Autowired
	private AddItemToCartServiceImpl service;
	
	public AddItemToCartServiceImpl getService() {
		return service;
	}

	public void setService(AddItemToCartServiceImpl service) {
		this.service = service;
	}
	@PostMapping("/AddToCart")
	public String addItemToCart(@RequestBody CartDTO cart) {
		if ((service.addItemToCart(cart))!=null) {
			return "Added Sucessfully";
		} else
			return "Unsucessful";
	}
    
}

