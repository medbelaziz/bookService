package appTest.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import appTest.model.Author;
import appTest.model.Book;
import appTest.model.BookNotFoundException;
import appTest.model.BookType;

@WebService(name = "BookService", serviceName = "BookService")
public interface BookService {

	Book getBook(Long id) throws BookNotFoundException;

	List<Book> getBooksByTitle(String title);

	List<Author> getAuthorsFromBook(@WebParam(name = "bookTitle") String bookTitle) throws BookNotFoundException;

	Long createBook(String title, BookType type, int year, Long... authorsId);
}
