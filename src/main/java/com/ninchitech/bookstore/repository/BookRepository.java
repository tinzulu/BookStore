package com.ninchitech.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninchitech.bookstore.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long>{

}
