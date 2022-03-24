package com.fbpzrl.clientapi.dto;

import java.io.Serializable;
import java.time.Instant;

import com.fbpzrl.clientapi.entities.Client;

public class ClientDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Instant brithDate;
	private Integer children;
	
	public ClientDTO() {}

	public ClientDTO(Long id, String name, String cpf, Double income, Instant brithDate, Integer children) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.brithDate = brithDate;
		this.children = children;
	}
	
	public ClientDTO(Client client) {
		this.id = client.getId();
		this.name = client.getName();
		this.cpf = client.getCpf();
		this.income = client.getIncome();
		this.brithDate = client.getBrithDate();
		this.children = client.getChildren();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Instant getBrithDate() {
		return brithDate;
	}

	public void setBrithDate(Instant brithDate) {
		this.brithDate = brithDate;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}
}
