package com.first.issuetracker;

import org.hibernate.criterion.Order;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class controller {
	
	@Autowired
	private services service;
	
	
	
	@RequestMapping("/")
	public String NewForm(Model model) {
	pa pa=new pa();
	model.addAttribute("pa",pa);
	return "index";
	}
	
	@RequestMapping("/save")
	public String saveForm(@ModelAttribute("pa") pa pa) {
		service.save(pa);
		return "display";
		
		
	}
	@GetMapping("/showNewEmployeeForm")
	   public String showNewEmployeeForm(Model model){
		pa pa =new pa();
		model.addAttribute("pa",pa);
		return "display";
}

@RequestMapping("/update/{Empid}")
public ModelAndView showEditKraPage(@PathVariable(name = "Empid") String id) {
	ModelAndView mav = new ModelAndView("index");
	pa pa = service.get(id);
	mav.addObject("pa", pa);
	return mav;
}
}


