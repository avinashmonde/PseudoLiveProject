package com.example.hotelmanagementsystem.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManagementValidationImpl implements ManagementValidation {

	Matcher mat = null;
	Pattern pat = null;
	
	@Override
	public Integer loginIdValidation(String userId) {
		// TODO Auto-generated method stub
		pat=Pattern.compile("\\d{1,10}");
		mat=pat.matcher(userId);
		if(mat.matches()) {
			return Integer.parseInt(userId);
		}
		return null;
	}

	
	
}
