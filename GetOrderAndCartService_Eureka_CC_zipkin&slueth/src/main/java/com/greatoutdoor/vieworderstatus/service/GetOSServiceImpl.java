package com.greatoutdoor.vieworderstatus.service;



import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatoutdoor.vieworderstatus.dao.GetOrderStatusDao;




@Service
	@Transactional
public class GetOSServiceImpl implements GetOS {
	 @Autowired
	    private GetOrderStatusDao dao;

	    public GetOrderStatusDao getDao(){
	        return dao;
	    }
	    @Override
	public Object viewOrderStatus(String userId) {
	
		return  dao.findByUserId(userId);
				}


}
