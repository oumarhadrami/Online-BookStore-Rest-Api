package com.mohamed.hadramy.firstonlinebookstorespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mohamed.hadramy.firstonlinebookstorespringboot.model.Book;

@CrossOrigin(origins = "http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {

}
