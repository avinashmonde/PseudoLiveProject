package com.example.hotelmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelmanagementsystem.beans.ResponseBean;
import com.example.hotelmanagementsystem.beans.RoomInfoBean;
import com.example.hotelmanagementsystem.service.ManagementService;

@RestController
@CrossOrigin( origins = "*", allowedHeaders = "*")
public class AllotedRoomController {

	@Autowired
	private ManagementService service;
	
	@GetMapping(path = "/allotedRoom")
//	@ResponseBody
	public ResponseBean allotment(   ) {
		
		List<RoomInfoBean> room = service.allotedRoom();
		ResponseBean bean = new ResponseBean();
		if(room != null) {
			bean.setCode(200);
			bean.setMessage("Success");
			bean.setDescription("Room Alloted Successfully");
		//	bean.set
		}
		else {
			bean.setCode(400);
			bean.setMessage("Failed");
			bean.setDescription("Failed to allot room");
		}
		
		return bean;
		
	}
	
}
