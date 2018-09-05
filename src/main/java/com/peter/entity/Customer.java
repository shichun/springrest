package com.peter.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


//@Data
//@Entity
//@EqualsAndHashCode(of = "id")
//@RequiredArgsConstructor
//@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class Customer {
	private @Id @GeneratedValue Long id;
	private  String firstname;
	private  String lastname;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
