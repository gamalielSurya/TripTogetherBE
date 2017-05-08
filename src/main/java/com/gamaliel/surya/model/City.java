package com.gamaliel.surya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class City {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private Integer cId;
	private String name;
	@ManyToOne
	@JoinColumn(name="pid")
	private Province mProvince;
	public City() {

	}
	public City(String name, Province mProvince) {
		this.name = name;
		this.mProvince = mProvince;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Province getProvince() {
		return mProvince;
	}
	public void setProvince(Province mProvince) {
		this.mProvince = mProvince;
	}
	
}
