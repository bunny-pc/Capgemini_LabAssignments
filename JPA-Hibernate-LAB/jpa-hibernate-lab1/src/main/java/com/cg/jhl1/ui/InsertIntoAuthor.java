package com.cg.jhl1.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jhl1.entity.Author;
import com.cg.jhl1.util.JPAUtil;

public class InsertIntoAuthor {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		Author a1=new Author("Venkata","Sai","Reddy",7207388239L);
		Author a2=new Author("Gajula","Naveen","",9261381629L);
		Author a3=new Author("Bhanu","Prakesh","Reddy",7207325639L);
		Author a4=new Author("Alla","Pavan","Ajay",7207385000L);
		
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		txn.commit();
		JPAUtil.shutdown();
	}

}
