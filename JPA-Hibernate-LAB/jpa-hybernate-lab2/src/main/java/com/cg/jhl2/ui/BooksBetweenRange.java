package com.cg.jhl2.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jhl2.entity.Book;
import com.cg.jhl2.util.JPAUtil;

public class BooksBetweenRange {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		String jpql="SELECT b FROM Book b WHERE b.price between :limit1 and :limit2";
		
		TypedQuery<Book> tqry= em.createQuery(jpql,Book.class);
		tqry.setParameter("limit1", 500.0);
		tqry.setParameter("limit2", 1000.0);
		List<Book> books=tqry.getResultList();
		
		
		for(Book book:books) {
			
			System.out.println(book.getBookAuthors());
			
		}
		
		JPAUtil.shutdown();
		
	}

}
