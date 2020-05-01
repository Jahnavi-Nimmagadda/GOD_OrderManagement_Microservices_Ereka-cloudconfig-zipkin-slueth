package com.greatoutdoor.vieworderstatus.entities;

import java.sql.Date;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordertable_dto")
public class OrderDTO {
	@Id
	private String orderId;
	private String userId;
	private String addressId;
	private String orderDispatchStatus;
	private Date orderIntiateTime;
	private Date orderDispatchTime;
	public OrderDTO(String orderId, String userId, String addressId, String orderDispatchStatus, Date orderIntiateTime,
			Date orderDispatchTime) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.addressId = addressId;
		this.orderDispatchStatus = orderDispatchStatus;
		this.orderIntiateTime = orderIntiateTime;
		this.orderDispatchTime = orderDispatchTime;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getOrderDispatchStatus() {
		return orderDispatchStatus;
	}
	public void setOrderDispatchStatus(String orderDispatchStatus) {
		this.orderDispatchStatus = orderDispatchStatus;
	}
	public Date getOrderIntiateTime() {
		return orderIntiateTime;
	}
	public void setOrderIntiateTime(Date orderIntiateTime) {
		this.orderIntiateTime = orderIntiateTime;
	}
	public Date getOrderDispatchTime() {
		return orderDispatchTime;
	}
	public void setOrderDispatchTime(Date orderDispatchTime) {
		this.orderDispatchTime = orderDispatchTime;
	}
	
}