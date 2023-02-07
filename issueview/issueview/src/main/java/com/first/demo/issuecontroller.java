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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.first.demo.issuemodel;


@Controller
public class issuecontroller
{
	@Autowired
	private issueservice issueservice;  
	
	
	@RequestMapping("/")
	public String viewHomePages(Model model) {
	List<issuemodel>issuemodel = issueservice.listAll();
	model.addAttribute("issuemodel", issuemodel);

	return "ticketdisplay";
	}
	
	@RequestMapping ("/ticketcreate")
	public String ticketcreate(Model model) {
		issuemodel issuemodel=new issuemodel();
	model.addAttribute("issuemodel", issuemodel);
	return "tickets";
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute("issuemodel") issuemodel issuemodel) {
		issueservice.save(issuemodel);
		return "redirect:";
			
	}

@GetMapping("/update/{Empid}")
public ModelAndView updates(@PathVariable(name = "Empid") String Empid) {
	ModelAndView mav = new ModelAndView("tickets");
	issuemodel issuemodel = issueservice.get(Empid);
	mav.addObject("issuemodel", issuemodel);
	return mav;
} 





@RequestMapping("/displays")
public String viewHomePage(Model model) {
List<issuemodel>issuemodel = issueservice.listAll();
model.addAttribute("issuemodel", issuemodel);

return "display";
}
@GetMapping("/updates/{Empid}")
public ModelAndView showupdatee(@PathVariable(name = "Empid") String id) {
	ModelAndView mav = new ModelAndView("update1");
	issuemodel issuemodel = issueservice.get(id);
	mav.addObject("issuemodel", issuemodel);
	return mav;

}






@PostMapping("/updatesave")
public String updateAsset(@ModelAttribute("issuemodel") issuemodel issuemodel) {

issueservice.save(issuemodel);
return "redirect:";
	
}
}









