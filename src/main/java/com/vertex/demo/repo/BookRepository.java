package com.vertex.demo.repo;

import com.vertex.demo.model.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book,Integer> {

  @Query("SELECT book FROM Book book WHERE book.author LIKE ?1 OR book.publicationDate = ?2 OR book.publisher LIKE ?3 OR book.title LIKE ?4")
  List<Book> findByAuthorOrPublisherOrPublicationDateOrTitle(String author, String publicationDate, String publisher, String title);

}
