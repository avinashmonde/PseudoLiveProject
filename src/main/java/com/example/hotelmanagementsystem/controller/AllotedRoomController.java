package com.example.hotelmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelmanagementsystem.beans.ResponseBean;
import com.example.hotelmanagementsystem.beans.RoomInfoBean;
import com.example.hotelmanagementsystem.exception.Exceptions;
import com.example.hotelmanagementsystem.service.ManagementService;

@RestController
@CrossOrigin( origins = "*", allowedHeaders = "*")
public class AllotedRoomController {

	@Autowired
	private ManagementService service;
	
	@GetMapping(path = "/allotedRoom")
//	@ResponseBody
	public ResponseBean allotment(RoomInfoBean roomInfoBean) {
		
	//	List<UserBean> userList = (List<UserBean>) new UserBean();
		boolean room = service.allotedRoom();
		ResponseBean bean = new ResponseBean();
		try {
			
			if(room) {
				bean.setCode(200);
				bean.setMessage("Success");
				bean.setDescription("Room Alloted Successfully");
			//	bean.set
			//	bean.setUserList(userList);
			}
			else {
				bean.setCode(400);
				bean.setMessage("Failed");
				bean.setDescription("Failed to allot room");
			}
		} catch (Exceptions e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to get room ");
		}
		
		return bean;
		
	}
	
}
