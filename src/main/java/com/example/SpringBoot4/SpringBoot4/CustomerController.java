package com.example.SpringBoot4.SpringBoot4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
	
	@GetMapping("/Customer")
	public String pass() {
		
		return "Customer.jsp";
	}
	
	
	@PostMapping("/cdetails")
	public String viewDetailsOfCustomer(@RequestParam("cid")int cid,
			@RequestParam("cname")String cname,
			@RequestParam("cmail")String cmail,ModelMap modelMap) {
		modelMap.put("cid",cid);
		modelMap.put("cname",cname);
		modelMap.put("cmail",cmail);
		
		return "CustomerView.jsp";
	}
}
