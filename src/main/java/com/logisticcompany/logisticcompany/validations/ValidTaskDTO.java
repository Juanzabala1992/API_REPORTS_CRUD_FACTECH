package com.logisticcompany.logisticcompany.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;


@Constraint(validatedBy= {TaskDTOValidatior.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidTaskDTO {
	String message() default "Tipo de documento no valido";
	Class<?>[]groups()default{};
	Class<?extends Payload>[] payload() default{};
}
