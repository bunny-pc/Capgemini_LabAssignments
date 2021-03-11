package com.cg.jhl2.entity;

/*
 * 
 * author:								book
 * 		101 	sai						maths, physics, ANN
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
@Table(name="authors_lab2")
public class Author implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long ID;
	
	@Column(name="name")
	private String name;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= {CascadeType.ALL})
	@JoinTable(name="book_author_lab2",
	joinColumns=@JoinColumn(name="ID"),
	inverseJoinColumns=@JoinColumn(name="ISBN"))
	private Set<Book> books;
	
	public Author() {
		
	}

	public Author(Long ID, String name) {
		super();
		this.ID = ID;
		this.name = name;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	public String getBookAuthors() {
		return String.format("ID=%s \t name=%s \t books=%s",ID,name,books);
	}

	@Override
	public String toString() {
		return String.format("ID=%s, name=%s", ID, name);
	}

	

		
	

}
