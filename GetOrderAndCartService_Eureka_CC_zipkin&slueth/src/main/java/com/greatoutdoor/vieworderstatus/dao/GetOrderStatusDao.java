package com.greatoutdoor.vieworderstatus.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatoutdoor.vieworderstatus.dto.OrderDTO;


public interface GetOrderStatusDao extends JpaRepository<OrderDTO, String>{


	@Query("select o from  OrderDTO o where o.userId=?1")
    List<OrderDTO> findByUserId(String userId);

	
	

}
