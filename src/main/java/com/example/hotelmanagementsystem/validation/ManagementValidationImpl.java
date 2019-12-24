package com.example.hotelmanagementsystem.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManagementValidationImpl implements ManagementValidation {

	Matcher matcher = null;
	Pattern pattern = null;
	
	@Override
	public String registrationIdValidation(String userId) {
		// TODO Auto-generated method stub
		pattern=Pattern.compile("\\d{1,5}");
		matcher=pattern.matcher(userId);
		if(matcher.matches()) {
			return userId;
		}
		else {
			return null;
		}
		
		
//		String userId1 = "\\d{1,5}";
//		pattern = Pattern.compile(userId1);
//		if(pattern.matcher(userId).matches()) {
//			return userId1;
//		}
//		return null;
		
	}

	public String registrationPhoneNoValidation(String phoneNo) {
		pattern = Pattern.compile("\\d{1,10}");
		matcher=pattern.matcher(phoneNo);
		if(matcher.matches()) {
			return phoneNo;
		}
		else {
			return null;
		}
		
	}
	
	public String registrationAddressValidation(String address) {
		pattern = Pattern.compile("");
		matcher= pattern.matcher(address);
		if(matcher.matches()) {
			return address;
		}
		else {
			return null;
		}
	}
	
	public String registrationNationality(String nationality) {
		pattern = Pattern.compile("");
		matcher=pattern.matcher(nationality);
		if(matcher.matches()) {
			return nationality;
		}
		else {
			return null;
		}
	}
	
}
