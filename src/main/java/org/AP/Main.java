package org.AP;

import org.AP.account.Account;
import org.AP.display.Display;
import org.AP.signup.Signup;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Signup signup = new Signup();
        signup.main(args);
        Display display = new Display();
        display.displayUser();
    }
}