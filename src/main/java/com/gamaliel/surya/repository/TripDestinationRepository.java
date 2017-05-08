package com.gamaliel.surya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gamaliel.surya.model.TripDestination;

public interface TripDestinationRepository extends CrudRepository<TripDestination, Integer> {
	List<TripDestination> findByTpId(Integer CId);
}
