package com.cg.go.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.dto.CartDTO;
import com.cg.go.service.CartServiceImpl;

@RestController
@RequestMapping("/Order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {

	@Autowired
	private CartServiceImpl service;

	public CartServiceImpl getService() {
		return service;
	}

	public void setService(CartServiceImpl service) {
		this.service = service;
	}

	
	@GetMapping("/RemoveItemFromCartDetails/{userId}")
	public List<CartDTO> getDeleteByOrderIdDetails(@PathVariable("userId") String userId)
    { return service. getDeleteByOrderIdDetails(userId);
	     }
	     

}
