package com.cg.jhl2.ui;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jhl2.entity.Author;
import com.cg.jhl2.entity.Book;
import com.cg.jhl2.util.JPAUtil;

public class AddDataIntoDatabase {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		Book b1=new Book(1001L,"Mathmatics",100.0);
		Book b2=new Book(1002L,"JAVA",600.0);
		Book b3=new Book(1003L,"CProgramming",900.0);
		Book b4=new Book(1004L,"Physics",1400.0);
		Book b5=new Book(1005L,"Chemistry",1600.0);
		Book b6=new Book(1006L,"Biology",1300.0);
		Book b7=new Book(1007L,"Economics",1800.0);
		
		
		Author a1=new Author(1001L,"bunny");
		Author a2=new Author(1002L,"surya");
		Author a3=new Author(1003L,"harshitha");
		Author a4=new Author(1004L,"charitra");
		
		Set<Book> bunnyBooks=new LinkedHashSet<>();
		bunnyBooks.add(b1);
		bunnyBooks.add(b2);
		bunnyBooks.add(b4);
		
		Set<Book> suryaBooks=new LinkedHashSet<>();
		suryaBooks.add(b7);
		suryaBooks.add(b1);
		
		Set<Book> harshithaBooks=new LinkedHashSet<>();
		harshitha
			Books.add(b6);
		harshithaBooks.add(b5);
		
		Set<Book> charitraBooks=new LinkedHashSet<>();
		charitraBooks.add(b3);
		charitraBooks.add(b4);
		charitraBooks.add(b2);
		
		a1.setBooks(bunnyBooks);
		a2.setBooks(suryaBooks);
		a3.setBooks(harshithaBooks);
		a4.setBooks(charitraBooks);
		
		
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
