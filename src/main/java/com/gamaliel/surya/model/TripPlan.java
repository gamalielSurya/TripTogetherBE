package com.gamaliel.surya.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TripPlan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tpid")
	private Integer tpId;
	private String title;
	private Date start_date;
	private Date finish_date;
	private Integer min_budget;
	private Integer max_budget;
	private Integer creator_id;
	private String itinerary;
	private String link;
	private boolean smoking;
	private boolean alcohol;
	private boolean pet;
	
	public TripPlan() {

	}
	public TripPlan(String title, Date start_date, Date finish_date, Integer min_budget, Integer max_budget, Integer creator_id,
			String itinerary, String link, boolean smoking, boolean alcohol, boolean pet) {
		this.title = title;
		this.start_date = start_date;
		this.finish_date = finish_date;
		this.min_budget = min_budget;
		this.max_budget = max_budget;
		this.creator_id = creator_id;
		this.itinerary = itinerary;
		this.link = link;
		this.smoking = smoking;
		this.alcohol = alcohol;
		this.pet = pet;
	}
	public Integer getTpId() {
		return tpId;
	}
	public void setTpId(Integer tpId) {
		this.tpId = tpId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getFinish_date() {
		return finish_date;
	}
	public void setFinish_date(Date finish_date) {
		this.finish_date = finish_date;
	}
	public Integer getMin_budget() {
		return min_budget;
	}
	public void setMin_budget(Integer min_budget) {
		this.min_budget = min_budget;
	}
	public Integer getMax_budget() {
		return max_budget;
	}
	public void setMax_budget(Integer max_budget) {
		this.max_budget = max_budget;
	}
	public Integer getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(Integer creator_id) {
		this.creator_id = creator_id;
	}
	public String getItinerary() {
		return itinerary;
	}
	public void setItinerary(String itinerary) {
		this.itinerary = itinerary;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public boolean isSmoking() {
		return smoking;
	}
	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}
	public boolean isAlcohol() {
		return alcohol;
	}
	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}
	public boolean isPet() {
		return pet;
	}
	public void setPet(boolean pet) {
		this.pet = pet;
	}
	@Override
	public String toString() {
		return "trip_plan [tpId=" + tpId + ", title=" + title + ", start_date=" + start_date + ", finish_date="
				+ finish_date + ", min_budget=" + min_budget + ", max_budget=" + max_budget + ", creator_id="
				+ creator_id + ", itinerary=" + itinerary + ", link=" + link + ", smoking=" + smoking + ", alcohol="
				+ alcohol + ", pet=" + pet + "]";
	}
	
}
