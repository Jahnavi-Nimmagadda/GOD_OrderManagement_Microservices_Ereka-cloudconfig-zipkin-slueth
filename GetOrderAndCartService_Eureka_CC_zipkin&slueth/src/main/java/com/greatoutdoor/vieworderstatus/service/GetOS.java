package com.greatoutdoor.vieworderstatus.service;

import java.util.List;

import com.greatoutdoor.vieworderstatus.dto.OrderDTO;



public interface GetOS {
	
	List<OrderDTO> getOrderAndCartService(String userId);
}
