package com.infotech.people.manangement.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infotech.people.manangement.app.entities.Person;

public interface PeopleManangementDao extends CrudRepository<Person, Integer>{
	List<Person> getPeronInfoByLastName(String lastName);
	List<Person> findByFirstNameAndEmail(String firstName,String email);
}
