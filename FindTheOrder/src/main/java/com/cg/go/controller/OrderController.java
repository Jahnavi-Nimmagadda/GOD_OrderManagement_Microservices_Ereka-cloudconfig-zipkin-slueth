package com.cg.go.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.dto.CartDTO;
import com.cg.go.exceptions.UserIdNotFoundException;
import com.cg.go.service.CartServiceImpl;

@RestController
@RequestMapping("/Order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="controller user id is not present")
	@ExceptionHandler({Exception.class})
	public void handleException()
	{
		
	}

	@Autowired
	private CartServiceImpl service;

	public CartServiceImpl getService() {
		return service;
	}

	public void setService(CartServiceImpl service) {
		this.service = service;
	}

	
	@GetMapping("/RemoveItemFromCartDetails/{userId}")
	public List<CartDTO> getDeleteByOrderIdDetails(@PathVariable("userId") String userId) throws UserIdNotFoundException
    { return service. getDeleteByOrderIdDetails(userId);
	     }
	     

}
