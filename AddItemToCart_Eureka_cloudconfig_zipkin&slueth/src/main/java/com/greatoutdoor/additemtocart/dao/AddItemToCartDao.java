package com.greatoutdoor.additemtocart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatoutdoor.additemtocart.entities.CartDTO;


public interface AddItemToCartDao extends JpaRepository<CartDTO, String> {

}

