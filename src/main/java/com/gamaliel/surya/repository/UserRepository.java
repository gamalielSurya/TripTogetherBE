package com.gamaliel.surya.repository;

import org.springframework.data.repository.CrudRepository;

import com.gamaliel.surya.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
