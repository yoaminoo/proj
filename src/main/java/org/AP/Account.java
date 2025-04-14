package org.AP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    protected int role;
    protected String name;
    protected String username;
    protected String password;
    protected String Email;
    protected int age;

    public Account(int role, String name, String username, String password, String Email, int age) {
        this.role = role;
        this.name = name;
        this.username = username;
        this.password = password;
        this.Email = Email;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
    public boolean checkEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+[^.]@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

class Artist extends Account {
    public Artist(int role, String name, String username, String password, String Email, int age) {
        super(role, name, username, password, Email, age);
    }
}
class Admin extends Account {
    public Admin(int role, String name, String username, String password, String Email, int age) {
        super(role, name, username, password, Email, age);
    }
}
class User extends Account {
    public User(int role, String name, String username, String password, String Email, int age) {
        super(role, name, username, password, Email, age);
    }
}