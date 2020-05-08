package com.greatoutdoor.additemtocart.service;

import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatoutdoor.additemtocart.dao.AddItemToCartDao;
import com.greatoutdoor.additemtocart.entities.CartDTO;

@Service
@Transactional
public class AddItemToCartServiceImpl implements AddItemToCartService{

    @Autowired
    private AddItemToCartDao dao;

    public AddItemToCartDao getDao(){
        return dao;
    }
 
    
	@Override
	public Object addItemToCart(CartDTO cart) {
		// Adding to cart
		CartDTO b = dao.save(cart);
		if (b != null)
			return true;
		else
			return false;
	}

}

