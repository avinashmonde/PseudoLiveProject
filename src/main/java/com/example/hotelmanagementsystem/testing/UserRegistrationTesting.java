package com.example.hotelmanagementsystem.testing;

import com.example.hotelmanagementsystem.beans.UserBean;
import com.example.hotelmanagementsystem.dao.ManagementDaoImpl;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRegistrationTesting {

	UserBean bean = new UserBean();
	@Autowired
	private ManagementDaoImpl management;

	@BeforeEach
	public void createObject() {
		management = new ManagementDaoImpl();
	}

	@Test
	public void registerTest() {

		String name = "Avinash";
		bean.setUserId(100);
		bean.setUserName("Avinash");
		bean.setPassword("");
		bean.setUserType("");

		UserBean user = management.register(bean);
		// boolean expected = true;
	//	UserBean actual = management.register(bean);
		Assert.assertEquals(name, bean.getUserName());
	}
}
