package com.greatoutdoor.vieworderstatus.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatoutdoor.vieworderstatus.dao.GetOrderStatusDao;
import com.greatoutdoor.vieworderstatus.dto.OrderDTO;

@Service
@Transactional
public class GetOSServiceImpl implements GetOS {
	@Autowired
	private GetOrderStatusDao dao;

	public GetOrderStatusDao getDao() {
		return dao;
	}

	@Override
	public List<OrderDTO> getOrderAndCartService(String userId) {

		return dao.findByUserId(userId);
	}

}
