package com.example.demo.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
@Entity

public class Userentity {
	@Id
	private int id;
	private String name;
	private int price;
	private int quantity;
	private String manufacturedate;
	private String Expireddate;
	public Userentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userentity(int id, String name, int price, int quantity, String manufacturedate, String expireddate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.manufacturedate = manufacturedate;
		Expireddate = expireddate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getManufacturedate() {
		return manufacturedate;
	}
	public void setManufacturedate(String manufacturedate) {
		this.manufacturedate = manufacturedate;
	}
	public String getExpireddate() {
		return Expireddate;
	}
	public void setExpireddate(String expireddate) {
		Expireddate = expireddate;
	}

}
