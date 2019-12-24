package com.example.hotelmanagementsystem.exception;

import com.example.hotelmanagementsystem.validation.ManagementValidation;
import com.example.hotelmanagementsystem.validation.ManagementValidationImpl;

public class ManagementException {

	static ManagementValidation managementValidation = new ManagementValidationImpl();

	public static String loginidValidation(String userId) throws Exceptions {
		String id = managementValidation.registrationIdValidation(userId);
		if (id != null) {
			return id;
		} else {
			throw new Exceptions("Invalid input for login id \n Id should be in range of 1 to 10");
		}

	}

	public static String phoneNumberValidation(String phoneNo) throws Exceptions{
		String number = managementValidation.registrationIdValidation(phoneNo);
		if (number != null) {
			return number;
		} else {
			throw new Exceptions("Invalid input for phone no \n Phone No should be in range of 1 to 10");
		}
	}

	public static String addressValidation(String address) throws Exceptions{
		String address1 = managementValidation.registrationIdValidation(address);
		if (address1 != null) {
			return address1;
		} else {
			throw new Exceptions("Invalid input for address \n Address should be in range of 1 to 250");
		}
	}

	public static String nationalityValidation(String nationality) throws Exceptions{
		String nationality1 = managementValidation.registrationIdValidation(nationality);
		if (nationality1 != null) {
			return nationality1;
		} else {
			throw new Exceptions("Invalid input for nationality \n Nationality should be in range of 1 to 10");
		}
	}

}
