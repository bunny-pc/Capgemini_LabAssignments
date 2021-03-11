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
		
		Book b1=new Book(1001L,"Mathmatics",1600.0);
		Book b2=new Book(1002L,"JAVA",400.0);
		Book b3=new Book(1003L,"CProgramming",300.0);
		Book b4=new Book(1004L,"Physics",1200.0);
		Book b5=new Book(1005L,"Chemistry",600.0);
		Book b6=new Book(1006L,"Biology",1000.0);
		Book b7=new Book(1007L,"Economics",800.0);
		
		
		Author a1=new Author(1001L,"Venkata");
		Author a2=new Author(1002L,"Sai");
		Author a3=new Author(1003L,"SaiKumar");
		Author a4=new Author(1004L,"Naveen");
		
		Set<Book> venkataBooks=new LinkedHashSet<>();
		venkataBooks.add(b1);
		venkataBooks.add(b2);
		venkataBooks.add(b4);
		
		Set<Book> saiBooks=new LinkedHashSet<>();
		saiBooks.add(b7);
		saiBooks.add(b1);
		
		Set<Book> saiKumarBooks=new LinkedHashSet<>();
		saiKumarBooks.add(b6);
		saiKumarBooks.add(b5);
		
		Set<Book> naveenBooks=new LinkedHashSet<>();
		naveenBooks.add(b3);
		naveenBooks.add(b4);
		naveenBooks.add(b2);
		
		a1.setBooks(venkataBooks);
		a2.setBooks(saiBooks);
		a3.setBooks(saiKumarBooks);
		a4.setBooks(naveenBooks);
		
		
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
