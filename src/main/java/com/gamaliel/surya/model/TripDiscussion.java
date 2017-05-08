package com.gamaliel.surya.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TripDiscussion {
	@Id
	private Integer tpId;
	private Integer uId;
	private Date created;
	private String comment;
	public TripDiscussion() {

	}
	public TripDiscussion(Integer uId, Date created, String comment) {
		this.uId = uId;
		this.created = created;
		this.comment = comment;
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
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
