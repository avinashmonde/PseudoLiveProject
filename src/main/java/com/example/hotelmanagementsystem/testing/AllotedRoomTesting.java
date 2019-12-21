package com.example.hotelmanagementsystem.testing;

import com.example.hotelmanagementsystem.dao.ManagementDao;
import com.example.hotelmanagementsystem.service.ManagementService;

public class AllotedRoomTesting {

	private ManagementService service;
	
	ManagementDao manage = (ManagementDao) service.allotedRoom();
			
	@BeforeEach
	public void createObject() {
		manage = 
	}
	
	@Test
	public void testAllotedRoom() {
		
		boolean actual = manage.allotment();
		boolean expected = true;
		
		Assert.assertEquals(expected, actual);
	}
}
