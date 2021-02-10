package com.mohamed.hadramy.firstonlinebookstorespringboot.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mohamed.hadramy.firstonlinebookstorespringboot.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
	
	@RestResource(path = "category_id")
	Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
	
	@RestResource(path = "search_by_keyword")
	Page<Book> findByNameContainingIgnoreCase(@Param("keyword") String keyword, Pageable pageable);
}
