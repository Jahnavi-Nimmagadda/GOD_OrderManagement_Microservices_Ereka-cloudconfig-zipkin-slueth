package com.greatoutdoor.canceltheproduct.service;

import java.util.Optional;


import javax.transaction.Transactional;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatoutdoor.canceltheproduct.dao.RemoveItemFromCart;
import com.greatoutdoor.canceltheproduct.entities.CartDTO;


  @Service
	@Transactional
	public class RemoveItemServiceImpl implements RemoveItemService {
		 
		  
		  @Autowired
		    private RemoveItemFromCart dao;

		    public RemoveItemFromCart getDao(){
		        return dao;
		    }
		  

			@Override
			public boolean removeItemFromCart(String productId, String userId) {
				Optional<CartDTO> c = dao.findById(userId);
				if (c != null) {
					dao.deleteById(productId);
					return true;
				} else
					return false;

			}

		
	}
