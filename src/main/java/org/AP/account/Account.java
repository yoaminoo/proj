package org.AP.account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    protected String role;
    protected String nameAndAge;
    protected String username;
    protected String password;
    protected String Email;

    public Account(String role, String nameAndAge, String username, String password, String Email) {
        this.role = role;
        this.nameAndAge = nameAndAge;
        this.username = username;
        this.password = password;
        this.Email = Email;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return Email;
    }
    public String getRole() {
        return role;
    }
    public String getNameAndAge() {
        return nameAndAge;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
    public static boolean checkEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+[^.]@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}



