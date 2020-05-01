package com.greatoutdoor.vieworderstatus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.greatoutdoor.vieworderstatus.entities.OrderDTO;


public interface GetOrderStatusDao extends JpaRepository<OrderDTO, String>{


	
	//public Optional<OrderDTO> findByUserId(String userId);
    
   // @Query("SELECT * FROM OrderDTO o where o.userId = ?1")
    List<OrderDTO> findByUserId(String userId);

	
	

}
