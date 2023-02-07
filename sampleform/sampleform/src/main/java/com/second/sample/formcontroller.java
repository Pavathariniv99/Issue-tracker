package com.second.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;




@Controller

public class formcontroller {

	@Autowired
	private formservice formservice;  
	
	
	@RequestMapping("/")
	public String viewHomePages(Model model) {
	List<formmodel>formmodel = formservice.listAll();
	model.addAttribute("formmodel", formmodel);

	return "form";
	}
	@RequestMapping("/save")
	public String save(@ModelAttribute("formmodel") formmodel formmodel) {
		formservice.save(formmodel);
		return "redirect:";
			
	}
	
	
	@RequestMapping ("/add")
	public String deptadd(Model model) {
		formmodel	 departmentmodel=new formmodel();
	model.addAttribute("formmodel", departmentmodel);
	return "form1";
	}
	@RequestMapping ("/add11")
	public String formadd(Model model) {
		formmodel	 departmentmodel=new formmodel();
	model.addAttribute("formmodel", departmentmodel);
	return "form";
	}
	
	@RequestMapping ("/add111")
	public String form1add(Model model) {
		formmodel	 departmentmodel=new formmodel();
	model.addAttribute("formmodel", departmentmodel);
	return "form2";
	}
}
















