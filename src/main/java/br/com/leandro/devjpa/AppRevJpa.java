package br.com.leandro.devjpa;

import java.util.Iterator;
import java.util.List;

import br.com.leandro.devjpa.dao.PersonDAO;
import br.com.leandro.devjpa.entity.Person;

public class AppRevJpa {
	public static void main(String[] args) {
//		insertPerson();
//		findAllPerson();
//		findPersonById();
//		countPerson();
//		findByLastName();
	}
	
	private static void findByLastName() {
		List<Person> persons = new PersonDAO().findByLastName("Batista");
		for(Person p : persons) {
			System.out.println(p.toString());
		}
	}



	private static void countPerson() {
		Long total = new PersonDAO().count();
		System.out.println("Total de Pessoas "+total);
	}



	private static void findPersonById() {
		Person p1 = new PersonDAO().findById(1L);
		System.out.println(p1.toString());
 	}

	private static void findAllPerson() {
		List<Person> persons= new PersonDAO().findAll();
		for(Person p: persons) {
			System.out.println(p.toString());
		}
	}

	public static void insertPerson() {
		Person p1 = new Person();
		p1.setFirtName("Luis");
		p1.setLastName("Batista");
		p1.setAge(5);
		
		new PersonDAO().save(p1);
		System.out.println(p1.toString());
		
//		Person p2 = new Person();
//		p2.setFirtName("Vinicius");
//		p2.setLastName("Lucca");
//		p2.setAge(14);
//		
//		new PersonDAO().save(p2);
//		System.out.println(p2.toString());
//
//		Person p3 = new Person();
//		p3.setFirtName("Solange Batista");
//		p3.setLastName("Silva");
//		p3.setAge(14);
//		
//		new PersonDAO().save(p3);
//		System.out.println(p3.toString());
	}
}
