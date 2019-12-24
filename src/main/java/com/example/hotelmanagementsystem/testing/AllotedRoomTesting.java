package com.example.hotelmanagementsystem.testing;

import com.example.hotelmanagementsystem.beans.RoomInfoBean;
import com.example.hotelmanagementsystem.controller.AllotedRoomController;
import com.example.hotelmanagementsystem.dao.ManagementDaoImpl;

import org.junit.Assert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AllotedRoomTesting {

	private AllotedRoomController allotedRoom = null;
	RoomInfoBean infoBean = new RoomInfoBean();
	ManagementDaoImpl service = null;
			
	@BeforeEach
	public void createObject() {
		boolean management = service.allotment();
	}
	
	
	@Test
	public void testAllotedRoom() {
		
		boolean actual = service.allotment();
		boolean expected = true;
		
		Assert.assertEquals(expected, actual);
	}
}
