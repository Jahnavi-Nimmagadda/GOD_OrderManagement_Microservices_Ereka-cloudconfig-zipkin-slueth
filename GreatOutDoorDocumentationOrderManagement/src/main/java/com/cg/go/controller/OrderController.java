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
import com.cg.go.dto.OrderProductMapDTO;
import com.cg.go.exceptions.OrderIdNotFoundException;
import com.cg.go.service.OrderServiceImpl;

@RestController
@RequestMapping("/Order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {

	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="controller order id is not present")
	@ExceptionHandler({Exception.class})
	public void handleException()
	{
		
	}
	
	@Autowired
	private OrderServiceImpl service;

	public OrderServiceImpl getService() {
		return service;
	}

	public void setService(OrderServiceImpl service) {
		this.service = service;
	}

	
	@GetMapping("/DeleteOrderProductMapEntityDetails/{orderId}")
	public List<OrderProductMapDTO> getDeleteByOrderIdDetails(@PathVariable("orderId") String orderId) throws OrderIdNotFoundException
    { return service.getDeleteByOrderIdDetails(orderId);
	     }
	     

}
