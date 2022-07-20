package com.ndourcodeur.model;

public class Todo {
	
	private Integer id;
	private String name;
	private Double quantity;
	
	
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Todo(Integer id, String name, Double quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}

}
