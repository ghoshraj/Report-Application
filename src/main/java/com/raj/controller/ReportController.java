package com.raj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.entity.CitizenPlan;
import com.raj.request.SearchRequest;
import com.raj.service.ReportService;

@Controller
public class ReportController {
   
	@Autowired
	private ReportService service;

	@GetMapping("/")
	public String indexpage(Model model) {
		model.addAttribute("Search",new SearchRequest());
		init(model);
		return "index"; 
	}
	
	@PostMapping("/search")
	public String handelSearch(@ModelAttribute("Search") SearchRequest request,Model model ) {
		List<CitizenPlan>plan =service.search(request);
		model.addAttribute("plan",plan);
		init(model);
		return "index";
	}

	private void init(Model model) {
		
		model.addAttribute("names",service.getPlanNames());
		model.addAttribute("status",service.getPlanStatus());
	}
}
