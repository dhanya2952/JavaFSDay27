package com.graymatter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

@NamedQuery(name="Person.findByName",query="select p from Person p where p.name=:name")
@NamedQuery(name="Person.findByNameAndAge", query="select p from Person p where p.name=:name And p.age=:age")
public class Person {
	
	private String name;
	@Id
	private int id;
	private int age;

}
