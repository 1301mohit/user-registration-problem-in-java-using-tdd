package com.bridgelabz.userRegistration;

import java.util.regex.Pattern;

public class UserValidator {
    private String regexPatternForName = "^[A-Z]{1}[a-z]{2,}$";
    private String regexPatternForMobileNumber = "^[0-9]{1,}[ ][0-9]{10}$";
    //private String regexPatternForEmail = "^[a-zA-Z][0-9a-zA-Z._+-]*[@]{1}[a-zA-Z0-9][.]{1}[.a-zA-Z]{2,4}[.][a-zA-Z]{2,3}*$";
   // private String regexPatternForEmail = "^[a-zA-Z0-9]{1,}([._-+a-zA-Z0-9]{1,})?[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,4})?([.][a-zA-Z]{2})?$";
    private String regexPatternForEmail = "^[a-zA-Z0-9]([-._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2,3}){0,1}$";
    private String regexPatternForPassword = "^[0-9]*((?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,})";
    public boolean firstNameValidator(String firstName) {
        Pattern pattern = Pattern.compile(regexPatternForName);
        return pattern.matcher(firstName).matches();
    }

    public boolean lastNameValidator(String lastName) {
        Pattern pattern = Pattern.compile(regexPatternForName);
        return pattern.matcher(lastName).matches();
    }

    public boolean mobileNumberValidator(String mobileNumber) {
        Pattern pattern = Pattern.compile(regexPatternForMobileNumber);
        return pattern.matcher(mobileNumber).matches();
    }

    public boolean emailValidator(String email) {
        Pattern pattern = Pattern.compile(regexPatternForEmail);
        return pattern.matcher(email).matches();
    }

    public boolean passwordValidator(String password) {
        Pattern pattern = Pattern.compile(regexPatternForEmail);
        return pattern.matcher(password).matches();
    }
}
