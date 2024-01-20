package com.client.tmp.model;


public class Role {
	private Integer id;
	private ERole name;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Integer id, ERole name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ERole getName() {
		return name;
	}
	public void setName(ERole name) {
		this.name = name;
	}
	
}
