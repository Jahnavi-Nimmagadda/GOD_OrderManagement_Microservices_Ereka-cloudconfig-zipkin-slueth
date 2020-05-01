package com.cg.go.service;


import com.cg.go.dto.CartDTO;

public interface OrderService {

	boolean addItemToCart(CartDTO cart);

	boolean removeItemFromCart(String productId,String userId);

	boolean deleteOrderProductMapEntity(String orderId);

	Object getOrderAndCartService(String userId);

}
