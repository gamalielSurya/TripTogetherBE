package com.gamaliel.surya.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserActivity {
	@Id
	private Integer uId;
	private Integer aId;
	public UserActivity() {

	}
	public UserActivity(Integer uId, Integer aId) {
		this.uId = uId;
		this.aId = aId;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
}
