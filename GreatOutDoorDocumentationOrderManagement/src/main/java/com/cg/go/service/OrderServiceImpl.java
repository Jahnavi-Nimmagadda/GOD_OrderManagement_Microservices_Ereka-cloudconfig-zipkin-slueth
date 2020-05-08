package com.cg.go.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.OrderProductMapDao;
import com.cg.go.dto.OrderProductMapDTO;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {


	@Autowired
	private OrderProductMapDao pdao;

	public OrderProductMapDao getDao1() {
		return pdao;
	}

    @Override
public List<OrderProductMapDTO>  getDeleteByOrderIdDetails(String orderId) {

return  pdao.findByOrderId(orderId);
			}

}
