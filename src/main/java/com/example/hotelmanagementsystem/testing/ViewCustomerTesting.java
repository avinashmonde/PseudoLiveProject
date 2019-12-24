package com.example.hotelmanagementsystem.testing;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.hotelmanagementsystem.dao.ManagementDaoImpl;

public class ViewCustomerTesting {

	ManagementDaoImpl management = null;
	
	@BeforeEach
	public void createObject() {
		boolean viewCustomer = management.viewCustomerDetails();
	}
	
	@Test
	public void viewCustomerTest() {
		boolean actual = true;
		boolean expected = management.viewCustomerDetails();
		//Assert.assertEquals(expected, actual);
		Assert.assertEquals(expected, actual);
	}
}

