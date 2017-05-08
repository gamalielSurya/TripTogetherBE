package com.gamaliel.surya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer aId;
	private String name;
	public Activity() {

	}
	public Activity(String name) {
		this.name = name;
	}
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
}
