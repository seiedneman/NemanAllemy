package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.book;
import com.example.demo.repository.repository;

@Service
public class service {

	@Autowired
	private repository repository;
	

	public void save(book b) {
		repository.save(b);
	}
	public void delete(int id) {
		repository.delete(id);
	}
	public book findOne(int id) {
		return repository.findOne(id);
	}
	public List<book> findAll(){
		List<book> temp=new ArrayList<>();
		for(book b:repository.findAll()) {
			temp.add(b);
		}
		return temp;
	}
	
}
