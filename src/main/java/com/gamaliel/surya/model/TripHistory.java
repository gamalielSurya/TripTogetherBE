package com.gamaliel.surya.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TripHistory {
	@Id
	private Integer tpId;
	private Integer uId;
	public TripHistory() {

	}
	public TripHistory(Integer tpId, Integer uId) {
		this.tpId = tpId;
		this.uId = uId;
	}
	public Integer getTpId() {
		return tpId;
	}
	public void setTpId(Integer tpId) {
		this.tpId = tpId;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
}
