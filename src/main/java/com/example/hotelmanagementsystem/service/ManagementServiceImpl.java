package com.example.hotelmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelmanagementsystem.beans.UserBean;
import com.example.hotelmanagementsystem.dao.ManagementDao;

@Service
public class ManagementServiceImpl implements ManagementService {

	@Autowired
	private ManagementDao dao;

	@Override
	public UserBean register(UserBean bean) {
		return dao.register(bean);
	}

	@Override
	public boolean allotedRoom() {
		return dao.allotment();
	}

	@Override
	public boolean viewCustomer() {
		return dao.viewCustomerDetails();
	}

	@Override
	public boolean viewBillReport() {
		return dao.viewBillDetails();
	}

}
