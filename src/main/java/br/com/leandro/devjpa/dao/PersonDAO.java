package br.com.leandro.devjpa.dao;

import java.util.List;

import br.com.leandro.devjpa.entity.Person;

public class PersonDAO extends GenericDAO<Person>{

	public PersonDAO() {
		super(Person.class);
	}
	
	public List<Person> findByLastName(String lastName){
		String jpql = "from Person p where p.lastName like ?1";
		return find(jpql, lastName);
	}
}
