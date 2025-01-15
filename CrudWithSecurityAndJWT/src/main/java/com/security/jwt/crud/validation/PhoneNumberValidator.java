package com.security.jwt.crud.validation;

import com.security.jwt.crud.exception.CustomValidationException;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, Long> {

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null || !String.valueOf(value).matches("\\d{10}")) {
            throw new CustomValidationException("Invalid phone number! It should be a 10-digit number.");
        }
        return true;
    }
}
