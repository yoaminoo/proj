package org.AP.toString;

import org.AP.account.Account;

public class ToString {
    public static String toString(Account account) {
       return "name and age: " + account.getNameAndAge() + "\n" + "role :" + account.getRole() + "\n" + "username: " + account.getUsername() + "\n" + "password: " + account.getPassword() + "\n" + "E-mail: " + account.getEmail() + "\n" + "\"end of object\"";
    }
}
