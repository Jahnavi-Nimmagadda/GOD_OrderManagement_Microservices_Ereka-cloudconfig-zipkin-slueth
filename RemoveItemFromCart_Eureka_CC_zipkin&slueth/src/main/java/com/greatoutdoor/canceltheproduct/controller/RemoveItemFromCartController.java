package com.greatoutdoor.canceltheproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greatoutdoor.canceltheproduct.exceptions.ProductIdNotFoundException;
import com.greatoutdoor.canceltheproduct.service.RemoveItemServiceImpl;



@RestController
@RequestMapping("/Cart")
@CrossOrigin("http://localhost:4200")
public class RemoveItemFromCartController {

	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="controller product id is not present")
	@ExceptionHandler({Exception.class})
	public void handleException()
	{
		
	}
	
	@Autowired
	private RemoveItemServiceImpl cartservice;

	public RemoveItemServiceImpl getService() {
		return cartservice;
	}
	
	
@DeleteMapping("/RemoveItemFromCart/{productId}/{userId}")
public String removeItemFromCart(@PathVariable("productId") String productId,@PathVariable("userId") String userId) throws ProductIdNotFoundException {
	if ((cartservice.removeItemFromCart(productId, userId))==true) {
		return "removed the Item from cart Sucessfully";
	} else
		return "Given product,does not exist the cart";
}
}