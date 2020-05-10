package com.greatoutdoor.canceltheorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greatoutdoor.canceltheorder.exceptions.OrderIdNotFoundException;
import com.greatoutdoor.canceltheorder.service.DeleteOrderProductMapServiceImpl;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins="http://localhost:4200")
public class DeletOrderProductMApController {
	
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="controller order id is not present")
	@ExceptionHandler({Exception.class})
	public void handleException()
	{
		
	}
	@Autowired
	private DeleteOrderProductMapServiceImpl service;

	public DeleteOrderProductMapServiceImpl getService() {
		return service;
	}

@DeleteMapping("/DeleteOrderProductMapEntity/{orderId}")
public String deleteOrderProductMapEntity(@PathVariable("orderId") String orderId) throws OrderIdNotFoundException {
	if ((service.deleteOrderProductMapEntity(orderId))) {
		return "Cancelled the order Sucessfully";
	} else
		return "Unsucessful";
}
}