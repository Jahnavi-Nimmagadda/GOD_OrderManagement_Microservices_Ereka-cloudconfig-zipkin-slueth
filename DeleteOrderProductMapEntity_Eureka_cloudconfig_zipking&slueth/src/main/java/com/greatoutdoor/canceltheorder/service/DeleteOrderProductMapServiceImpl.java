package com.greatoutdoor.canceltheorder.service;

import java.util.Optional;


import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatoutdoor.canceltheorder.dao.DeleteOrderProductMapDao;
import com.greatoutdoor.canceltheorder.entities.OrderProductMapDTO;


  @Service
	@Transactional
	public class DeleteOrderProductMapServiceImpl implements DeleteOrderProductMapService {
		 
		  
		  @Autowired
		    private DeleteOrderProductMapDao dao;

		    public DeleteOrderProductMapDao getDao(){
		        return dao;
		    }
		  
		    @Override
			public boolean deleteOrderProductMapEntity(String orderId) {
				Optional<OrderProductMapDTO> opm= dao.findById(orderId);
				if (opm!=null) {
					dao.deleteById(orderId);
					return true;
				} else
					return false;

			}

		
	}
