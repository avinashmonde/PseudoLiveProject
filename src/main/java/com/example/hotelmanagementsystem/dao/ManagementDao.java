package com.example.hotelmanagementsystem.dao;

import java.util.List;

import com.example.hotelmanagementsystem.beans.RoomInfoBean;
import com.example.hotelmanagementsystem.beans.UserBean;
import com.example.hotelmanagementsystem.beans.UserDetailsBean;

public interface ManagementDao {

	public boolean register(UserBean bean);

	public List<RoomInfoBean> allotment();

	public List<UserDetailsBean> viewCustomerDetails();

	public boolean viewBillDetails();

	//ManagementDao register(int userId, String userName, String userType, String password);

}
