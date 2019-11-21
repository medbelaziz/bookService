package appTest.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

import appTest.model.Author;
import appTest.model.AuthorNotFoundException;
import appTest.model.Book;
import appTest.model.BookType;

public class AuthorServiceImpl implements AuthorService {
	final static Logger logger = Logger.getLogger(AuthorServiceImpl.class);

	static List<Book> books = Arrays.asList(new Book(1l, "title 1", BookType.SCIENCE_FICTION, 2000),
			new Book(2l, "title 2", BookType.SCIENCE_FICTION, 2000),
			new Book(3l, "title 3", BookType.SCIENCE_FICTION, 2000));

	static List<Author> auths = Arrays.asList(new Author(1l, "Mohammed", "Belaziz", "Marocain", new Date(), new Date()),
			new Author(2l, "Mohammed", "Belaziz", "Marocain", new Date(), new Date()),
			new Author(3l, "Mohammed", "Belaziz", "Marocain", new Date(), new Date()));

	public List<Book> getBooksFromAuthor(String authorFirstName, String authorLastName) throws AuthorNotFoundException {
		logger.debug("getBooksFromAuthor");
		return books;
	}

	public Author getAuthor(Long id) throws AuthorNotFoundException {
		logger.debug("getAuthor");
		return new Author(1l, "Mohammed", "Belaziz", "Marocain", new Date(), new Date());
	}

	public List<Author> getAuthorsByName(String firstName, String lastName) throws AuthorNotFoundException {
		logger.debug("getAuthorsByName");

		return Arrays.asList(new Author(1l, firstName, lastName, "Marocain", new Date(), new Date()));
	}

	public Long createAuthor(String firstName, String lastName, String nationality, Date dateOfBirth,
			Date dateOfDeath) {
		logger.debug("createAuthor");

		auths.add(new Author(100l, firstName, lastName, nationality, dateOfBirth, dateOfDeath));
		return 1l;
	}

}
