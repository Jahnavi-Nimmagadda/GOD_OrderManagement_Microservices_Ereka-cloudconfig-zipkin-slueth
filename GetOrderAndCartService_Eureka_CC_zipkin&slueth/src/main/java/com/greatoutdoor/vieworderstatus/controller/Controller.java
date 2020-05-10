package com.greatoutdoor.vieworderstatus.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greatoutdoor.vieworderstatus.dto.OrderDTO;
import com.greatoutdoor.vieworderstatus.exceptions.UserIdNotFoundException;
import com.greatoutdoor.vieworderstatus.service.GetOSServiceImpl;

@RestController
@RequestMapping("/order")
@CrossOrigin("http://localhost:4200")
public class Controller {
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="controller user id is not present")
	@ExceptionHandler({Exception.class})
	public void handleException()
	{
		
	}
	@Autowired
	private GetOSServiceImpl service;

	public GetOSServiceImpl  getService() {
		return service;
	}

	@GetMapping("/GetOrderAndCartService/{userId}")
	public List<OrderDTO> getOrderAndCartService(@PathVariable("userId") String userId) throws UserIdNotFoundException {
		return service.getOrderAndCartService(userId);
	}

}
