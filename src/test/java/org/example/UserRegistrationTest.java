package org.example;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest
{
    @Test
    public void givenfirstnameshouldbeTrue(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validateFirstName("Soma");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastnameshouldbeTrue() {
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validateLastName("Gosavi");
        Assert.assertEquals(true, result);
    }
    @Test
    public void validateforemail(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validateEmailTest("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenMobilenoconditionmeetthenTrue(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validateMobileNumber("91 9421551510");
        Assert.assertEquals(true, result);

    }
    @Test
    public void givenPasswordconditionmeetthenTrue(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validatePassword("Abc45ut3");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword1conditionmeetthenTrue(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validatePasswordatleastoneUpperCase("Aber345o");
        Assert.assertEquals(true,result);
    }
}