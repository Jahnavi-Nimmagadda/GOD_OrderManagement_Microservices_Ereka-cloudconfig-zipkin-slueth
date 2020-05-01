package com.greatoutdoor.vieworderstatus.controller;
		import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatoutdoor.vieworderstatus.service.GetOS;
		@RestController
		@RequestMapping("/order")
		@CrossOrigin("http://localhost:1331")
		public class Controller {
			@Autowired
			  GetOS orderService;
			      @GetMapping("/viewOrderStatus/{userId}")
			      public Object viewOrderStatus(@PathVariable String userId) {
			    	  return orderService.viewOrderStatus(userId);
			      }
					
					
		}

	


