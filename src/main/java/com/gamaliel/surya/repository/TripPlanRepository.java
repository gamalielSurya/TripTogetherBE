package com.gamaliel.surya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gamaliel.surya.model.TripPlan;

public interface TripPlanRepository extends CrudRepository<TripPlan, Integer>{
	List<TripPlan> findByTitle(String title);
}
