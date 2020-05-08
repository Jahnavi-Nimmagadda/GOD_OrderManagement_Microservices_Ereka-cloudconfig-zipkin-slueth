package com.greatoutdoor.canceltheproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;




import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.greatoutdoor.canceltheproduct.service.RemoveItemServiceImpl;



@RestController
@RequestMapping("/Cart")
@CrossOrigin("http://localhost:4200")
public class RemoveItemFromCartController {

	@Autowired
	private RemoveItemServiceImpl cartservice;

	public RemoveItemServiceImpl getService() {
		return cartservice;
	}
	
	
@DeleteMapping("/RemoveItemFromCart/{productId}/{userId}")
public String removeItemFromCart(@PathVariable("productId") String productId,@PathVariable("userId") String userId) {
	if ((cartservice.removeItemFromCart(productId, userId))==true) {
		return "removed the Item from cart Sucessfully";
	} else
		return "Given product,does not exist the cart";
}
}