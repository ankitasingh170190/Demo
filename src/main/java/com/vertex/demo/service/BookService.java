package com.vertex.demo.service;


import com.vertex.demo.model.Book;
import com.vertex.demo.repo.BookRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
  @Autowired
  private BookRepository bookRepository;

  @PersistenceContext
  EntityManager entityManager = null;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }
  public List<Book> listAllBooks() {
    return bookRepository.findAll();
  }

  public List<Book> listMostSearchedBooks(int limit) {
    return entityManager.createQuery("SELECT book FROM Book book ORDER BY book.count DESC",
        Book.class).setMaxResults(limit).getResultList();
  }
}
