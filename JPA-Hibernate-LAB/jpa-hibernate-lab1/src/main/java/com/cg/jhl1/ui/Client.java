package com.cg.jhl1.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jhl1.entity.Greet;
import com.cg.jhl1.util.JPAUtil;

public class Client {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		Greet greet=new Greet("Welcome to JPA!");
		
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(greet);
		txn.commit();

		JPAUtil.shutdown();
	}

}
