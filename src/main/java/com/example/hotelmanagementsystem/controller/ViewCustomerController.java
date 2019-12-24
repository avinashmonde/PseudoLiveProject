package com.example.hotelmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelmanagementsystem.beans.ResponseBean;
import com.example.hotelmanagementsystem.beans.UserDetailsBean;
import com.example.hotelmanagementsystem.exception.Exceptions;
import com.example.hotelmanagementsystem.service.ManagementService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ViewCustomerController {

	@Autowired
	private ManagementService service;
	
	@GetMapping(path = "/viewCustomerReport")
//	@ResponseBody
	public ResponseBean viewCustomerReport(UserDetailsBean userDetailsBean  ) {
		
		ResponseBean bean = new ResponseBean();
		boolean view = service.viewCustomer();
		try {
			if(view) {
				bean.setCode(200);
				bean.setMessage("Success");
				bean.setDescription("Customer viewed successfully");
			}
			else {
				bean.setCode(400);
				bean.setMessage("Failed");
				bean.setDescription("Failed to view customers");
			}
		} catch (Exceptions e) {
			// TODO Auto-generated catch block
			e.getMessage();
			System.out.println("Failed to view customers");
		}
		
		return bean;
		
	}
	
}
