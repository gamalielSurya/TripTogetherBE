package com.gamaliel.surya.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TripDestination {
	@Id
	private Integer tpId;
	private Integer cId;
	public TripDestination() {

	}
	public TripDestination(Integer tpId, Integer cId) {
		this.tpId = tpId;
		this.cId = cId;
	}
	public Integer getTpId() {
		return tpId;
	}
	public void setTpId(Integer tpId) {
		this.tpId = tpId;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
}
