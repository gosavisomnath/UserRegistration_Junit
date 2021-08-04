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
}