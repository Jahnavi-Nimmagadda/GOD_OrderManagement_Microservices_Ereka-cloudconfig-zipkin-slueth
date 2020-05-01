package com.cg.go.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.CartDao;
import com.cg.go.dao.OrderDao;
import com.cg.go.dao.OrderProductMapDao;
import com.cg.go.dto.CartDTO;
import com.cg.go.dto.OrderProductMapDTO;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao odao;

	public OrderDao getDao() {
		return odao;
	}

	@Autowired
	private OrderProductMapDao pdao;

	public OrderProductMapDao getDao1() {
		return pdao;
	}

	@Autowired
	private CartDao cdao;

	public CartDao getDao2() {
		return cdao;
	}

	@Override
	public boolean addItemToCart(CartDTO cart) {
		// Adding to cart
		CartDTO b = cdao.save(cart);
		if (b != null)
			return true;
		else
			return false;
	}

	@Override
	public boolean removeItemFromCart(String productId, String userId) {
		Optional<CartDTO> c = cdao.findById(userId);
		if (c != null) {
			cdao.deleteById(productId);// deleting record with given productid in cartdto table
			// pdao.delete(productId);
			return true;
		} else
			return false;

	}

	@Override
	public boolean deleteOrderProductMapEntity(String orderId) {
		Optional<OrderProductMapDTO> opm= pdao.findById(orderId);
		if (opm!=null) {
			pdao.deleteById(orderId);
			return true;
		} else
			return false;

	}
    @Override
public Object getOrderAndCartService(String userId) {

return  odao.findByUserId(userId);
			}

}
