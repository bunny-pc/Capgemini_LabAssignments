package com.cg.jhl1.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jhl1.entity.Author;
import com.cg.jhl1.util.JPAUtil;

public class UpdateAuthorDetails {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Author id : ");
		Long authorId=scan.nextLong();
		Author a=em.find(Author.class, authorId);
		System.out.println("Enter update details if no update give as 'same'.");
		System.out.println("Enter First Name to update : ");
		String firstName=scan.next();
		if(firstName.equalsIgnoreCase("same")) {
			firstName=a.getFirstName();
		}
		System.out.println("Enter Middle Name to update : ");
		String middleName=scan.next();
		if(middleName.equalsIgnoreCase("same")) {
			middleName=a.getMiddleName();
		}
		System.out.println("Enter Last Name to update : ");
		String lastName=scan.next();
		if(lastName.equalsIgnoreCase("same")) {
			lastName=a.getLastName();
		}
		System.out.println("Enter Phone number to Update : ");
		String phoneNo=scan.next();
		if(phoneNo.equalsIgnoreCase("same")) {
			phoneNo=String.valueOf(a.getPhoneNo());
		}
		
		Author author =em.find(Author.class, authorId);
		if (author == null) {
			System.out.println("Product with id #"+authorId+" not found");
		}else {
			EntityTransaction txn=em.getTransaction();
			author.setFirstName(firstName);
			author.setLastName(lastName);
			author.setMiddleName(middleName);
			author.setPhoneNo(Long.parseLong(phoneNo));
			txn.begin();
			
			em.merge(author);
			
			txn.commit();
		}
		scan.close();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		
		txn.commit();
		JPAUtil.shutdown();
	}

}
