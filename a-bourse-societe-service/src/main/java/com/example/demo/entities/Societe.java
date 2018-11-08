package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Societe implements Serializable  {
	/**
	 * s
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id ;
	@Column
	private String nameSociete ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameSociete() {
		return nameSociete;
	}
	public void setNameSociete(String nameSociete) {
		this.nameSociete = nameSociete;
	}
	public Societe(String nameSociete) {
		super();
		this.nameSociete = nameSociete;
	}
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	



}
