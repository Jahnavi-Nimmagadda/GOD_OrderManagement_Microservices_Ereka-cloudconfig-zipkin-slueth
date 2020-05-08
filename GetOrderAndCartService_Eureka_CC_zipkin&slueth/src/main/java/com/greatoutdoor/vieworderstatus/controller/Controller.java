package com.greatoutdoor.vieworderstatus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatoutdoor.vieworderstatus.entities.OrderDTO;
import com.greatoutdoor.vieworderstatus.service.GetOSServiceImpl;

@RestController
@RequestMapping("/order")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private GetOSServiceImpl service;

	public GetOSServiceImpl  getService() {
		return service;
	}

	@GetMapping("/GetOrderAndCartService/{userId}")
	public List<OrderDTO> getOrderAndCartService(@PathVariable("userId") String userId) {
		return service.getOrderAndCartService(userId);
	}

}
