package com.cg.jhl1.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jhl1.entity.Author;
import com.cg.jhl1.util.JPAUtil;

public class DeleteAuthor {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Author ID to delete : ");
		Long authorId=scan.nextLong();
		Author author=em.find(Author.class, authorId);
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		if(author!=null) {
			em.remove(author);
			System.out.println("Author is removed");
		}else {
			System.out.println("Author doesn't exist");
		}
		txn.commit();
		scan.close();
		JPAUtil.shutdown();
	}

}
