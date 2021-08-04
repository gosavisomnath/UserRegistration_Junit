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
}