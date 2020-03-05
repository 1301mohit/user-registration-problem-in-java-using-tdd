package com.bridgelabz.userRegistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationTestForPassword {

    private UserValidator validator;
    private String password;
    private boolean flag;

    public UserRegistrationTestForPassword(String password, boolean flag) {
            this.password=password;
            this.flag=flag;
    }

    @Before
    public void initialize() {
        validator = new UserValidator();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList( new Object[][] {{ "mohit", false}});
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        Assert.assertEquals(this.flag, validator.passwordValidator(password));
    }
}
