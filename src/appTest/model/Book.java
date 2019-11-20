package appTest.model;

import java.util.List;

public class Book {

	private Long id;
	private String title;
	private BookType type;
	private int year;
	private List<Author> authors;

	public Book() {
		super();
	}

	public Book(Long id, String title, BookType type, int year) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.year = year;
	}

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

	public BookType getType() {
		return type;
	}

	public void setType(BookType type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

}
