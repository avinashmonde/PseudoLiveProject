package com.example.hotelmanagementsystem.dao;

import com.example.hotelmanagementsystem.beans.UserBean;

public interface ManagementDao {

	public UserBean register(UserBean bean);

	public boolean allotment();

	public boolean viewCustomerDetails();

	public boolean viewBillDetails();

}
