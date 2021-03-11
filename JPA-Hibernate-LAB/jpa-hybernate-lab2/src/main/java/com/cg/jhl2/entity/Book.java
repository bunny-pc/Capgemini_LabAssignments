package com.cg.jhl2.entity;



/*
 * 
 * books:							author:
 * 	maths						101 	sai , 105 ajay
 * 		102		venkata					ML, chemistry
 * 		103		naveen   				JAVA, C++
 */
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="books_lab2")
public class Book implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ISBN")
	private Long ISBN;
	
	@Column(name="title")
	private String title;
	
	@Column(name="price")
	private Double price;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= {CascadeType.ALL})
	@JoinTable(name="book_author_lab2",
	joinColumns=@JoinColumn(name="ISBN"),
	inverseJoinColumns=@JoinColumn(name="ID"))
	private Set<Author> authors;
	
	public Book() {
		
	}

	public Book(Long ISBN, String title, Double price) {
		super();
		this.ISBN = ISBN;
		this.title = title;
		this.price = price;
	}

	public Long getISBN() {
		return ISBN;
	}

	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	public String getBookAuthors() {
		return String.format("ISBN=%s \t title=%s \t price=%s \t Authors=%s",ISBN,title,price,authors);
	}

	@Override
	public String toString() {
		return String.format(" ISBN=%s, title=%s, price=%s ", ISBN, title, price);
	}

	

	
	

}
