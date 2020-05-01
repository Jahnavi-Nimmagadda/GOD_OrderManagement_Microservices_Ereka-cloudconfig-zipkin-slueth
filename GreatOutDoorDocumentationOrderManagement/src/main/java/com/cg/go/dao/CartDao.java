package com.cg.go.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.go.dto.CartDTO;


public interface CartDao extends JpaRepository<CartDTO, String> {

	@Query("select m.userId from CartDTO m where m.userId=?1")
	CartDTO exists(String userId);

	

}