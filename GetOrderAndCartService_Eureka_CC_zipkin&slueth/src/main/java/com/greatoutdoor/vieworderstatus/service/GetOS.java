package com.greatoutdoor.vieworderstatus.service;

import java.util.List;

import com.greatoutdoor.vieworderstatus.entities.OrderDTO;

public interface GetOS {
	
	List<OrderDTO> getOrderAndCartService(String userId);
}
