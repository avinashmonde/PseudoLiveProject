package com.example.hotelmanagementsystem.service;

import java.util.List;

import com.example.hotelmanagementsystem.beans.RoomInfoBean;
import com.example.hotelmanagementsystem.beans.UserBean;
import com.example.hotelmanagementsystem.beans.UserDetailsBean;

public interface ManagementService {

	public  boolean register(UserBean bean);

	public List<RoomInfoBean> allotedRoom();

	public List<UserDetailsBean> viewCustomer();

	public boolean viewBillReport();
	
}
