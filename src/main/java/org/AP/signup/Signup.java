package org.AP.signup;

import java.io.IOException;
import java.util.Scanner;

import org.AP.fileManager.FileManager;
import org.AP.p.P;
import org.AP.account.Account;
import org.AP.user.User;
import org.AP.artist.Artist;
import org.AP.admin.Admin;
import org.AP.printObject.PrintObj;
import org.AP.clearScreen.CS;

public class Signup {
    public static void main(String[] args) throws IOException {
        CS.cs();
        Scanner scan = new Scanner(System.in);
        P.ln("Hello welcome to our application!");
        P.ln("choose your role: ");
        P.ln("Artist");
        P.ln("User");
        P.ln("Admin");
        String role = scan.nextLine();
        while(!(role.equals("Artist")) && !(role.equals("Admin")) && !(role.equals("User"))) {
            CS.cs();
            P.ln("Please choose one of the following options:");
            P.ln("Artist");
            P.ln("User");
            P.ln("Admin");
            role = scan.nextLine();
        }
        CS.cs();
        P.ln("enter your name and age: ");
        String nameAndAge = scan.nextLine();
        CS.cs();
        P.ln("choose a username: ");
        String username = scan.nextLine();
        CS.cs();
        P.ln("choose a password: ");
        String password = scan.nextLine();
        CS.cs();
        P.ln("enter your email: ");
        String email = scan.nextLine();
//        while(!Account.checkEmail(email)) {
//            CS.cs();
//            P.ln("please enter a valid email address: ");
//            email = scan.nextLine();
//        }

        Account account = switch (role) {
            case "Artist" -> new Artist(role, nameAndAge, username, password, email);
            case "User" -> new User(role, nameAndAge, username, password, email);
            case "Admin" -> new Admin(role, nameAndAge, username, password, email);
            default -> null;
        };

        FileManager.saveAccount(account);
        P.ln("this is your information: ");
        PrintObj.printObj(account);
        scan.nextLine();
        CS.cs();
        P.ln("loading the main screen...");
        CS.cs();
    }
}