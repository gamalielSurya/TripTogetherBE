package com.gamaliel.surya.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TripActivity {
	@Id
	private Integer tpId;
	private Integer aId;
	public TripActivity() {

	}
	public TripActivity(Integer tpId, Integer aId) {
		this.tpId = tpId;
		this.aId = aId;
	}
	public Integer getTpId() {
		return tpId;
	}
	public void setTpId(Integer tpId) {
		this.tpId = tpId;
	}
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
}
