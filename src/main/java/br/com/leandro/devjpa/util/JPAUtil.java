package br.com.leandro.devjpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private EntityManagerFactory factory;
	
	private static JPAUtil instance;
	
	private JPAUtil() {
		this.factory = Persistence.createEntityManagerFactory("DEV-JPA");
	}
	
	public static synchronized JPAUtil getInstance() {
		
		if(instance == null) {
			instance = new JPAUtil();
		}
		return instance;
	}
	
	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
