package com.example.SpringBoot4.SpringBoot4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CustomerController {

    @Autowired
    CustomerRepository repo;

    
    
    @GetMapping("/Customer")
  public String Customer() {
     return "Customer.jsp";
     }
    
    ///Process 1 to store data to H2
    
//    @PostMapping("/jspViewData")///action=jspViewData connected to jsp page
//    public String getDetails(@ModelAttribute Customer customer,Model model) {
//    	  	   	
//        Customer user=repo.save(customer);
//    	    	
//    	model.addAttribute("cname",user.getCname());
//    	model.addAttribute("cid",user.getCid());
//    	model.addAttribute("cmail",user.getCmail());
//    	
//    	
//    	return "CustomerView.jsp";
//    }
    
    ///Process 2 to store data to H2
    
    @PostMapping("/jspViewData")
  public ModelAndView getDetails(@ModelAttribute Customer customer){
    	Customer user=repo.save(customer);
    	
     ModelAndView mv = new ModelAndView("CustomerView.jsp");
     
     mv.addObject("cname", user.getCname());
     mv.addObject("cid", user.getCid());
     mv.addObject("cmail", user.getCmail());
     
     
     return mv;
     
 }
    
}
