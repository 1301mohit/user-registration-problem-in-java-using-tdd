package com.bridgelabz.userRegistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    private UserValidator validator;

    @Before
    public void initialize() {
       validator = new UserValidator();
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(validator.firstNameValidator("Mohit"));
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        Assert.assertFalse(validator.firstNameValidator("Mo"));
    }

    @Test
    public void givenFirstNameWithInteger_ShouldReturnFalse() {
        Assert.assertFalse(validator.firstNameValidator("Mo123"));
    }

    @Test
    public void givenFirstName_WithoutCapitalLetterInStarting_ShouldReturnFalse() {
        Assert.assertFalse(validator.firstNameValidator("mohit"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(validator.lastNameValidator("Kumar"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        Assert.assertFalse(validator.lastNameValidator("Ku"));
    }

    @Test
    public void givenLastNameWithInteger_ShouldReturnFalse() {
        Assert.assertFalse(validator.lastNameValidator("123Ku"));
    }

    @Test
    public void givenLastName_WithoutCapitalLetterInStarting_ShouldReturnFalse() {
        Assert.assertFalse(validator.lastNameValidator("kumar"));
    }

}
