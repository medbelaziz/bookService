package appTest.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import appTest.model.Author;
import appTest.model.Book;
import appTest.model.BookNotFoundException;
import appTest.model.BookType;

public class BookServiceImpl implements BookService {

	static List<Book> books = Arrays.asList(new Book(1l, "title 1", BookType.SCIENCE_FICTION, 2000),
			new Book(2l, "title 2", BookType.SCIENCE_FICTION, 2000),
			new Book(3l, "title 3", BookType.SCIENCE_FICTION, 2000));

	static List<Author> auths = Arrays.asList(new Author(1l, "Mohammed", "Belaziz", "Marocain", new Date(), new Date()),
			new Author(2l, "Mohammed", "Belaziz", "Marocain", new Date(), new Date()),
			new Author(3l, "Mohammed", "Belaziz", "Marocain", new Date(), new Date()));

	public Book getBook(Long id) throws BookNotFoundException {
		return new Book(id, "title 3", BookType.SCIENCE_FICTION, 2000);
	}

	public List<Book> getBooksByTitle(String title) {
		return books;
	}

	public List<Author> getAuthorsFromBook(String bookTitle) throws BookNotFoundException {
		return auths;
	}

	public Long createBook(String title, BookType type, int year, Long... authorsId) {
		books.add(new Book(100l, title, type, year));
		return 1l;
	}

}
