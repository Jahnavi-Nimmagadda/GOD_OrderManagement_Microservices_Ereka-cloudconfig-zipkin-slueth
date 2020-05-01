package com.cg.go.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.go.dto.OrderDTO;

public interface OrderDao extends JpaRepository<OrderDTO, Integer> {
	 List<OrderDTO> findByUserId(String userId);


}


