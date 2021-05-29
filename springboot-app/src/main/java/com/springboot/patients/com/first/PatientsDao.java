package com.springboot.patients.com.first;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PatientsDao extends CrudRepository<Patients, Integer> {



	List<Patients> findByName(String name);



}
