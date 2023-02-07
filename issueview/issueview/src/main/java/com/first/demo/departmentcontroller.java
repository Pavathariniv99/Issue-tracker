package com.first.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class departmentcontroller {
	
	
	@Autowired
	private departmentservice departmentservice;  
	
	
	

	@RequestMapping("/dept")
	public String viewHomePages(Model model) {
	List<departmentmodel>departmentmodel = departmentservice.listAll();
	model.addAttribute("departmentmodel", departmentmodel);

	return "deptdisplay";
	}
	
	
	
	@RequestMapping ("/add")
	public String deptadd(Model model) {
		departmentmodel	 departmentmodel=new departmentmodel();
	model.addAttribute("departmentmodel", departmentmodel);
	return "departmentform";
	}
	
	
	
	@RequestMapping("/formsave")
	public String save(@ModelAttribute("departmentmodel") departmentmodel departmentmodel) {
		departmentservice.save(departmentmodel);
		
		return "redirect:http://localhost:8080/dept";
}
	
	
	@GetMapping("/deptupdate/{departname}")
	public ModelAndView updatesdept(@PathVariable(name = "departname") String departname) {
		ModelAndView mav = new ModelAndView("updatedept");
		departmentmodel departmentmodel = departmentservice.get(departname);
		mav.addObject("departmentmodel",departmentmodel);
		return mav;
	}

	@PostMapping("/updatedepart")
	public String updateAsset(@ModelAttribute("departmentmodel") departmentmodel departmentmodel) {

		departmentservice.save(departmentmodel);
	return "redirect:http://localhost:8080/dept";
		
	}

	@RequestMapping("/delete/{departname}")
	public String deleteProduct(@PathVariable(name = "departname") String departname) {
	   this.departmentservice.delete(departname);
	   return "redirect:http://localhost:8080/dept";
	      
	}




	

	
}
