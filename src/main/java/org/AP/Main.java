package org.AP;

import org.AP.account.Account;
import org.AP.artist.Artist;
import org.AP.display.Display;
import org.AP.login.Login;
import org.AP.p.P;
import org.AP.signup.Signup;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        while (true) {
            P.ln("Welcome to the program!");
            P.ln("1. Login");
            P.ln("2. Signup");
            P.ln("3. Exit");
            P.ln("Enter your option: ");
            int choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    Account account = Login.loginUser();
                    if (account == null) {
                        P.ln("Login failed! please try again.");
                        continue;
                    } else {
                        switch (account.getRole()) {
                            case "User":
                                new Display().displayUser();
                                break;
                            case "Artist":
                                new Display().displayArtist((Artist) account);
                                break;
                            case "Admin":
                                new Display().displayAdmin();
                                break;
                        }
                    }
                case 2:
                    Signup.main(args);
                    break;
                case 3:
                    P.ln("Terminating the program...");
                    scan.nextLine();
                    flag = true;
                    break;
                default:
                    P.ln("invalid option. Try again");
            }
            if (flag) {
                break;
            }
        }
    }
}