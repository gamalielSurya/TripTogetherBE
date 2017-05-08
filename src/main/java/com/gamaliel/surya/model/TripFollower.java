package com.gamaliel.surya.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TripFollower {
	@Id
	private Integer tpId;
	private Integer uId;
	public TripFollower() {

	}
	public TripFollower(Integer tpId, Integer uId) {
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
