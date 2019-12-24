package com.example.hotelmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.hotelmanagementsystem.beans.ResponseBean;
import com.example.hotelmanagementsystem.beans.UserBean;
import com.example.hotelmanagementsystem.service.ManagementService;

@RestController
@CrossOrigin( origins = "*", allowedHeaders = "*")
public class UserRegisterationController {

	@Autowired
	private ManagementService service;
	
	@PutMapping(path = "/register")
	@ResponseBody
	public ResponseBean Registration(UserBean bean) {
		
		UserBean management = service.register(bean);
		ResponseBean response = new ResponseBean();		
		try {
				
			if(management != null) {
				response.setCode(200);
				response.setMessage("Success");
				response.setDescription("Registered Successfully");
			}
			else {
				response.setCode(400);
				response.setMessage("Failed");
				response.setDescription("Failed to registered");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed to register");
		}
		return response;
				
//		UserBean bean1 = new UserBean();
//		ManagementDao dao = service.register(bean1);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter user id");
//		int userId= Integer.parseInt(sc.nextLine());
//		bean1.getUserId();
//		System.out.println("Enter user name");
//		String userName = sc.nextLine();
//		bean1.getUserName();
//		System.out.println("Enter type");
//		String userType = sc.nextLine();
//		bean1.getUserType();
//		System.out.println("Enter password");
//		String password = sc.nextLine();
//		bean1.getPassword();
//		
//		ManagementDao management = dao.register(bean1);
//		
//		if(management != null) {
//			System.out.println("User registered successfully");
//		}
//		else {
//			System.out.println("User failed to registered");
//		}
//		
//		return bean1;
		
		
	}
	
}
