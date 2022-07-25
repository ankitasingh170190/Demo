package com.vertex.demo.controller;

import com.vertex.demo.model.Book;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseBody;

public interface BooksRESTController {

  @GetMapping(value = "/rs/api/1.0/listofbooks",
  produces = {MediaType.APPLICATION_JSON_VALUE})
  @ResponseBody
  ResponseEntity<List<Book>> getListOfBooks();

  @GetMapping(value = "/rs/api/1.0/listofmostsearchedbooks",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ResponseBody
  ResponseEntity<List<Book>> getListOfMostSearchedBooks();
}
