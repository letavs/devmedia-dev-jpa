package br.com.leandro.devjpa;

import java.util.Arrays;
import java.util.List;

import br.com.leandro.devjpa.dao.DocumentosDAO;
import br.com.leandro.devjpa.dao.PersonDAO;
import br.com.leandro.devjpa.dao.TelefoneDAO;
import br.com.leandro.devjpa.entity.Documents;
import br.com.leandro.devjpa.entity.Person;
import br.com.leandro.devjpa.entity.Telefone;
import br.com.leandro.devjpa.entity.Telefone.TipoTelefone;

public class AppRevJpa {
	public static void main(String[] args) {
//		insertPerson();
//		findAllPerson();
//		findPersonById();
//		countPerson();
//		findByLastName();
//		findByAge();
//		findByFullName();
//		updatePerson();
//		deletePerson();
		
//		insertDocuments();
//		updateDocument();
//		findPersonByCpf();
//		inserirTelefone();
//		inserirTelefoneByPerson();
		atualizarTelefone();
		
	}
	
	private static void atualizarTelefone() {
		Person person = new PersonDAO().findById(2L);
		TelefoneDAO dao = new TelefoneDAO();
		Telefone tel = dao.findById(3L);
		tel.setPessoa(person);
		dao.update(tel);
		tel = dao.findById(tel.getId());
		System.out.println(tel.toString());
	}

	private static void inserirTelefoneByPerson() {
		Telefone ph1 = new Telefone(TipoTelefone.CELULAR, "994658557");
		Telefone ph2 = new Telefone(TipoTelefone.COMERCIAL, "45746668");
		
		Person person = new Person("Julival", "Silva", 42);
		person.setDocuments(new Documents("445.040.685-43", 325483052));
		
//		ph1.setPessoa(person);
//		ph2.setPessoa(person);
//		person.setTelefones(Arrays.asList(ph1,ph2));
		
		person.adicionarTelefone(ph1);
		person.adicionarTelefone(ph2);
		
		new PersonDAO().save(person);
		
	}

	private static void inserirTelefone() {
		
		Person p = new Person("Roberto", "Silva", 48);
		p.setDocuments(new Documents("345.669.187-23", 35774569));
		Telefone telefone = new Telefone(TipoTelefone.COMERCIAL, "4668-4469");
		telefone.setPessoa(p);
		TelefoneDAO dao = new TelefoneDAO();
		dao.save(telefone);
		
		telefone = dao.findById(telefone.getId());
		System.out.println(telefone.toString());
		
	}

	private static void findPersonByCpf() {
		Person p = new PersonDAO().findByCpf("122.112.324-23");
		System.out.println(p.toString());
	}

	private static void updateDocument() {
		Documents d1= new DocumentosDAO().findById(1L);
		System.out.println(d1.toString());
		d1.setCpf("122.112.324-23");
		new DocumentosDAO().update(d1);
		System.out.println(new DocumentosDAO().findById(1L).toString());
	}

	private static void insertDocuments() {
		Person p1 =new Person("Fabiana", "Manzatto", 32);
		p1.setDocuments(new Documents("146.112.324-23", 446858697));
		new PersonDAO().save(p1);
		System.out.println(p1.toString());
	}

	private static void deletePerson() {
		new PersonDAO().delete(3L);
	}

	private static void updatePerson() {
		Person p = new PersonDAO().findById(3L);
		System.out.println(p.toString());
		p.setAge(34);
		new PersonDAO().update(p);
	
		Person pAlterado = new PersonDAO().findById(3L);
		System.out.println(pAlterado.toString());
	}
	

	private static void findByFullName() {
		Person p = new PersonDAO().findByFullName("Fernando", "Batista");
		System.out.println(p.toString());
	}

	private static void findByAge() {
		List<Person> persons = new PersonDAO().findAgeIsBetween(0, 14);
		for(Person p : persons) {
			System.out.println(p.toString());
		}
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
//		Person p1 = new Person();
//		p1.setFirtName("Luis");
//		p1.setLastName("Batista");
//		p1.setAge(5);
//		
//		new PersonDAO().save(p1);
//		System.out.println(p1.toString());
		
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
