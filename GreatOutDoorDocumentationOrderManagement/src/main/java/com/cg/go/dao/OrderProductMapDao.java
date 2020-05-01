package com.cg.go.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.go.dto.OrderProductMapDTO;

public interface OrderProductMapDao extends JpaRepository<OrderProductMapDTO, String> {


}