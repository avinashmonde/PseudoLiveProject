package com.example.hotelmanagementsystem.service;

import com.example.hotelmanagementsystem.beans.UserBean;

public interface ManagementService {

	public  UserBean register(UserBean bean);

	public boolean allotedRoom();

	public boolean viewCustomer();

	public boolean viewBillReport();
	
}
