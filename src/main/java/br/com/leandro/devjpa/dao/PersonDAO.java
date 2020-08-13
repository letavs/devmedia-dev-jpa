package br.com.leandro.devjpa.dao;

import java.util.List;

import br.com.leandro.devjpa.entity.Person;

public class PersonDAO extends GenericDAO<Person>{

	public PersonDAO() {
		super(Person.class);
	}
	
	
	public Person findByCpf(String cpf) {
		String jpql = "select p from Person p, Documents d where d.cpf like ?1 "
				+ "and p.documents.id = d.id";
		return findOne(jpql, cpf);		
	}
	
	public Person findByFullName(String firstName, String lastName) {
		String jpql = "from Person p where p.firstName like ?1 and p.lastName like ?2";
		return findOne(jpql, firstName, lastName);
	}
	
	public List<Person> findByLastName(String lastName){
		String jpql = "from Person p where p.lastName like ?1";
		return find(jpql, lastName);
	}
	
	public List<Person> findAgeIsBetween(int min, int max){
		String jpql = "FROM Person p WHERE p.age BETWEEN ?1 AND ?2";
		return find (jpql, min, max);
	}
	
}
