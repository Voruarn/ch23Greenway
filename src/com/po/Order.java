package com.po;

public class Order {
	private Integer id;
	private Integer busertable_id;
	private Integer goodstable_id;
	private Double amount;
	private Integer status;
	private String orderdate;
	private Integer shoppingnum;
	
	
	public Integer getGoodstable_id() {
		return goodstable_id;
	}
	
	public void setGoodstable_id(Integer gtid) {
		this.goodstable_id=gtid;
	}
	
	public Integer getShoppingnum() {
		return shoppingnum;
	}
	
	public void setShoppingnum(Integer shnum) {
		this.shoppingnum=shnum;
	}
	
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBusertable_id() {
		return busertable_id;
	}
	public void setBusertable_id(Integer busertable_id) {
		this.busertable_id = busertable_id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
}
