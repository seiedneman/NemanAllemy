package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.book;
import com.example.demo.service.service;

//import com.example.demo.model.trainer;

@org.springframework.stereotype.Controller
public class Controller {
	
//	@Autowired
//	private com.example.demo.service.service service;
//	
	@Autowired
	private service service;
	
	@GetMapping("/hoho")
	public String home(Model model) {
		model.addAttribute("abbas",new book());
		model.addAttribute("shahir",service.findAll());
		return "ho";
	}
	
	@PostMapping("/hosein")
	public String register(@ModelAttribute("abbas")book b) {
		service.save(b);
	return "redirect:/hoho";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		service.delete(id);
		return "redirect:/hoho";
	}
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") int id,Model model) {
		model.addAttribute("abbas",service.findOne(id));
		return "ho";
	}
	
	
//	@GetMapping("/trainer")
//	public String home(Model model) {
//		model.addAttribute("trainer", new trainer());
//		List<trainer> unies=service.findAll();
//		model.addAttribute("trainers", unies);
//		return "trainer";
////	}
////	@PostMapping("/trainer")
////	public String showUni(@ModelAttribute("trainer")trainer university) {
////		service.save(university);
////		return"redirect:/trainer";
////
////	}
////	@RequestMapping(value="/member/edit/{id}")
////	public String editMember(@PathVariable("id") int id,Model model) {
////		trainer uni=service.findOne(id);
////		model.addAttribute("trainer",uni);
////		return "university";
////	}
////	@RequestMapping(value="/member/delete/{id}")
////	public String deleteMember(@PathVariable("id") int id,Model model) {
////		service.delete(id);
////		model.addAttribute("trainer", new trainer());
////		List<trainer> unies=service.findAll();
////		model.addAttribute("trainers", unies);
////		return"trainer";
////	}
}


