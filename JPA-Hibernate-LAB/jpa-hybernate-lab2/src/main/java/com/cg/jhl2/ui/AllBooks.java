package com.cg.jhl2.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jhl2.entity.Book;
import com.cg.jhl2.util.JPAUtil;

public class AllBooks {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		String jpql="SELECT b FROM Book b";
		
		TypedQuery<Book> tqry= em.createQuery(jpql,Book.class);
		
		List<Book> books=tqry.getResultList();
//		System.out.println(books.size());
		
		for(Book book:books) {
			System.out.println(book.getBookAuthors());
			
		}
		
		JPAUtil.shutdown();
		
	}

}
