package com.cg.jhl2.ui;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jhl2.entity.Book;
import com.cg.jhl2.util.JPAUtil;

public class BooksByAuthor {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the Author : ");
		String name=scan.next();
		
		String jrql="SELECT b FROM Book b join b.authors a WHERE a.name=?1";
		TypedQuery<Book> tqry=em.createQuery(jrql,Book.class);
		tqry.setParameter(1, name);
		List<Book> getBooks=tqry.getResultList();
		
		for(Book book:getBooks) {
			
			System.out.println(book);
			
		}
			
		scan.close();
		JPAUtil.shutdown();

	}

}
