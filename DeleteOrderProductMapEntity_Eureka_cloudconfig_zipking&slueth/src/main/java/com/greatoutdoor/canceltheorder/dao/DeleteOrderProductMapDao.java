package com.greatoutdoor.canceltheorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatoutdoor.canceltheorder.entities.OrderProductMapDTO;




public interface DeleteOrderProductMapDao extends JpaRepository<OrderProductMapDTO, String>  {

}
