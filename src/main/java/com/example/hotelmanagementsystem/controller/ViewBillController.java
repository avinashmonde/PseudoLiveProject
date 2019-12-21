package com.example.hotelmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelmanagementsystem.beans.ResponseBean;
import com.example.hotelmanagementsystem.service.ManagementService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ViewBillController {

	@Autowired
	private ManagementService service;

	@GetMapping(path = "/viewBill")
//	@ResponseBody
	public ResponseBean viewBill(  ) {

		ResponseBean bean = new ResponseBean();
		boolean viewBill = service.viewBillReport();
		if (viewBill) {
			bean.setCode(200);
			bean.setMessage("Success");
			bean.setDescription("Bill viewed successfully");
		} else {
			bean.setCode(400);
			bean.setMessage("Failed");
			bean.setDescription("Failed to load bill");
		}

		return bean;

	}

}
