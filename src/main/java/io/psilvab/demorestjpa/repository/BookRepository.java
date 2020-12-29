package io.psilvab.demorestjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.psilvab.demorestjpa.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByTitleContaining(String title);

}
