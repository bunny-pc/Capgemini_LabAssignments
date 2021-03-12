package com.cg.jhl1.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jhl1.entity.Author;
import com.cg.jhl1.util.JPAUtil;

public class InsertIntoAuthor {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		Author a1=new Author("Bunny","charitra","Reddy",9182500819L);
		Author a2=new Author("vennapusa","Surya","reddy",7569369939L);
		Author a3=new Author("lakku","Harshitha","Reddy",9704347355L);
		Author a4=new Author("Gude","Nandhini","Priya",7093661777L);
		
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
