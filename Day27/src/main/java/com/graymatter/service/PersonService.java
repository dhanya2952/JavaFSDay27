package com.graymatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.graymatter.entities.Person;
import com.graymatter.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repository;

	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public List<Person> getAllPersonsByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByname(name);
	}

	public Person addPerson(Person person) {
		// TODO Auto-generated method stub
		return repository.save(person);
	}

	public List<Person> getAllPersonsByNameAndAge(String name, int age) {
		// TODO Auto-generated method stub
		return repository.findByNameAndAge(name, age);
	}

}
