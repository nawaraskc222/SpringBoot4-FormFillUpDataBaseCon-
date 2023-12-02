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
    
    
    @PostMapping("/jsptocontrolleraction")///jsptocontrolleraction connected to jsp
    public String userAddtoHtwo(@ModelAttribute Customer customer,Model model) {
    	  	   	
        Customer user=repo.save(customer);
    	    	
    	model.addAttribute("cname",user.getCname());
    	model.addAttribute("cid",user.getCid());
    	model.addAttribute("cmail",user.getCmail());
    	
    	
    	return "CustomerView.jsp";
    }
    
//    @RequestMapping("/")
//    public String home() {
//        return "Customer.jsp";
//    }
//
//    @RequestMapping("/saveDetails")
//    public String saveDetails(Customer customer) {
//        repo.save(customer);
//        return "Customer.jsp";
//    }
//
//    @GetMapping("/getDetailsForm")
//    public String getDetailsForm() {
//        return "CustomerView.jsp";
//    }
//
//    @PostMapping("/getDetails")
//    public ModelAndView getDetails(@RequestParam("cid") int cid) {
//        ModelAndView mv = new ModelAndView("Retrieve.jsp");
//        Customer customer = repo.findById(cid).orElse(null);
//        mv.addObject("customer", customer);
//        return mv;
//    }
}
