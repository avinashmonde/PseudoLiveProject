package com.example.hotelmanagementsystem.testing;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.hotelmanagementsystem.dao.ManagementDaoImpl;

public class ViewBillTesting {

	ManagementDaoImpl management = null;
	
	@BeforeEach
	public void createObject() {
		boolean bill = management.viewBillDetails();
	}
	
	@Test
	public void billTest() {
		boolean expected = management.viewBillDetails();
		boolean actual = true;
		
		Assert.assertEquals(expected, actual);
	}
}
