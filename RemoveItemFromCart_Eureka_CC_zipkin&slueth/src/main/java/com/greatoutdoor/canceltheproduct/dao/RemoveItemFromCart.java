package com.greatoutdoor.canceltheproduct.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatoutdoor.canceltheproduct.entities.CartDTO;



public interface RemoveItemFromCart extends JpaRepository<CartDTO, String>  {

	
}
