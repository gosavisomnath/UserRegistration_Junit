package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationCase {


    //for First Name
    public boolean validateFirstName(String str) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", str);
        return check;
    }
}