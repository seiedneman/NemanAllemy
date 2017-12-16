package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.book;

@Repository
public interface repository extends CrudRepository<book, Integer>{

}
