package com.bookstore.springboot.entity;

import jakarta.persistence.*; // Assuming JPA

@Entity
@Table(name = "books")

public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;

	private String title;
	private String author;
	private int publishedYear;
	private String genre;

	// Constructors (especially a no-args constructor!)

	// Getters and setters for ALL fields 

	public Long getId() {
	    return id;
	}

	public void setId(Long id) {
	    this.id = id;
	}

	public String getTitle() {
	    return title;
	}

	public void setTitle(String title) {
	    this.title = title;
	}

	public String getAuthor() {
	    return author;
	}

	public void setAuthor(String author) {
	    this.author = author;
	}

	public int getPublishedYear() {
	    return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
	    this.publishedYear = publishedYear;
	}

	public String getGenre() {
	    return genre;
	}

	public void setGenre(String genre) {
	    this.genre = genre;
	}
}