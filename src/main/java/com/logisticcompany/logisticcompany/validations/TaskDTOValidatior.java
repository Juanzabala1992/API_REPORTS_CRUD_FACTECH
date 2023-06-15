package com.logisticcompany.logisticcompany.validations;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public abstract class TaskDTOValidatior implements ConstraintValidator<ValidTaskDTO, String> {
	
	List<String> tipo = Arrays.asList("C", "P");

	@Override
	public void initialize (ValidTaskDTO constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
		
		return tipo.contains(value); 
	}
}
