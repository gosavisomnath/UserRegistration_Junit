package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationCase {


    //for First Name
    public boolean validateFirstName(String str) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", str);
        return check;
    }
    public boolean validateLastName(String str) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", str);
        return check;
    }
    public boolean validateEmailTest(String emailTest) {
        boolean check = Pattern.matches("abc.xyz@bl.co.in", emailTest);
        return check;
    }
    public boolean validateMobileNumber(String str) {
        boolean check = Pattern.matches("^([0-9]{2}) ([1-9]{1}[0-9]{9})$" , str);
        return check;
    }
    public boolean validatePassword(String str) {
        boolean check = Pattern.matches("^[a-zA-Z0-9]{8,}$", str);
        return check;
    }
}