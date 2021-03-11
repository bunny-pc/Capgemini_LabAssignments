package com.cg.jhl2.ui;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jhl2.util.JPAUtil;

public class AuthorNameFromBookId {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the BookId : ");
		Long bId=scan.nextLong();
		
		String jrql="SELECT a.name FROM Author a join a.books b WHERE b.ISBN =?1";

		TypedQuery<String> tqry=em.createQuery(jrql,String.class);
		tqry.setParameter(1, bId);
		List<String> getNames=tqry.getResultList();
		
		for(String str:getNames) {
			
			System.out.println(str);
			
		}
		
		scan.close();
		JPAUtil.shutdown();

	}

}
