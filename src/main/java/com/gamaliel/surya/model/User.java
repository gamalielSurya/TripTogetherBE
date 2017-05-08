package com.gamaliel.surya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer uId;
	private String name;
	private boolean gender;
	private Integer age;
	private Integer rating;
	private boolean smoking;
	private boolean alcohol;
	private Integer marital;
	public User() {

	}
	public User(String name, boolean gender, Integer age, Integer rating, boolean smoking, boolean alcohol, Integer marital) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.rating = rating;
		this.smoking = smoking;
		this.alcohol = alcohol;
		this.marital = marital;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
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
	public Integer getMarital() {
		return marital;
	}
	public void setMarital(Integer marital) {
		this.marital = marital;
	}
}
