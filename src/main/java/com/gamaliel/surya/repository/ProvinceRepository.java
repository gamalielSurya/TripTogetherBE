package com.gamaliel.surya.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamaliel.surya.model.Province;


public interface ProvinceRepository extends JpaRepository<Province, Integer>{
	List<Province> findByName(String name);
}
