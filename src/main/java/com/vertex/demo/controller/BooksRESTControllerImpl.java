package com.vertex.demo.controller;

import com.vertex.demo.model.Book;
import com.vertex.demo.service.BookService;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class BooksRESTControllerImpl implements BooksRESTController {

  private BookService bookService;

  @Autowired
  public BooksRESTControllerImpl(BookService bookService) {
    this.bookService = bookService;
  }

  public ResponseEntity<List<Book>> getListOfBooks() {
    List<Book> result = Collections.emptyList();
    try {
      result =
          bookService.listAllBooks();
    } catch (
        ResponseStatusException ex) {
      throw ex;
    } catch (RuntimeException ex) {
      throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return ResponseEntity.status(HttpStatus.OK).body(result);
  }

  @Override
  public ResponseEntity<List<Book>> getListOfMostSearchedBooks() {
    List<Book> result = Collections.emptyList();
    try {
      result =
          bookService.listMostSearchedBooks(4);
    } catch (
        ResponseStatusException ex) {
      throw ex;
    } catch (RuntimeException ex) {
      throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return ResponseEntity.status(HttpStatus.OK).body(result);
  }
}
