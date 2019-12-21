package com.example.hotelmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelmanagementsystem.beans.RoomInfoBean;
import com.example.hotelmanagementsystem.beans.UserBean;
import com.example.hotelmanagementsystem.beans.UserDetailsBean;
import com.example.hotelmanagementsystem.dao.ManagementDao;

@Service
public class ManagementServiceImpl implements ManagementService {

	@Autowired
	private ManagementDao dao;

	@Override
	public boolean register(UserBean bean) {
		return dao.register(bean);
	}

	@Override
	public List<RoomInfoBean> allotedRoom() {
		return dao.allotment();
	}

	@Override
	public List<UserDetailsBean> viewCustomer() {
		return dao.viewCustomerDetails();
	}

	@Override
	public boolean viewBillReport() {
		return dao.viewBillDetails();
	}

}
