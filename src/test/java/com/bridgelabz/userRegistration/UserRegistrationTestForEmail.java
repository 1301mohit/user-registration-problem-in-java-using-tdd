package com.bridgelabz.userRegistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class UserRegistrationTestForEmail {

    private UserValidator userValidator;
    private String email;
    private boolean flag;

    public UserRegistrationTestForEmail(String email, boolean flag) {
        super();
        this.email = email;
        this.flag = flag;
    }

    @Before
    public void initialize() {
        userValidator = new UserValidator();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] { {"abc@yahoo.com", true},
                                              {"abc-100@yahoo.com", true},
                                              {"abc.100@yahoo.com", true},
                                              {"abc111@abc.com", true},
                                              {"abc-100@abc.net", true},
                                              {"abc@1.com", true},
                                              {"abc@gmail.com.com", true},
                                              {"abc+100@gmail.com", true },
                                              {"abc", false},
                                              {"abc@.com.my", false},
                                              {"abc123@gmail.a", false},
                                              {"abc123@.com", false},
                                              {"abc123@.com.com", false},
                                              {".abc@abc.com", false},
                                              {"abc()*@gmail.com", false},
                                              {"abc@%*.com", false},
                                              {"abc..2002@gmail.com", false},
                                              {"abc.@gmail.com", false},
                                              {"abc@abc@gmail.com", false},
                                              {"abc@gmail.com.1a", false},
                                              {"abc@gmail.com.aa.au", false}});

          //return Arrays.asList(new Object[] { "abc@.com.my", "abc123@gmail.a", "abc123@.com", ""});
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        System.out.println("Email:"+this.email);
        System.out.println("Flag:"+this.flag);
       // Assert.assertTrue(userValidator.emailValidator(email));
        Assert.assertEquals(this.flag, userValidator.emailValidator(email));
    }
}
