package org.AP.login;

import org.AP.account.Account;
import org.AP.user.User;
import org.AP.artist.Artist;
import org.AP.admin.Admin;
import org.AP.p.P;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class Login {
    public static Account loginUser() throws IOException {
        Scanner scan = new Scanner(System.in);
        P.ln("Please enter your role: ");
        P.ln("User");
        P.ln("Artist");
        P.ln("Admin");
        String role = scan.nextLine().trim();

        String fileName = "";

        switch (role) {
            case "User":
                fileName = "user.txt";
                break;
            case "Artist":
                fileName = "artist.txt";
                break;
            case "Admin":
                fileName = "admin.txt";
                break;
            default:
                P.ln("Invalid role. Try again");
                return null;
        }

        System.out.print("Enter your username: ");
        String username = scan.nextLine();
        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length >= 5
                    && tokens[2].trim().equals(username)
                    && tokens[3].trim().equals(password)) {
                    Account account = switch (role) {
                        case "User" -> new User(tokens[1].trim(), tokens[0].trim(), tokens[2].trim(), tokens[3].trim(), tokens[4].trim());
                        case "Artist" -> new Artist(tokens[1].trim(), tokens[0].trim(), tokens[2].trim(), tokens[3].trim(), tokens[4].trim());
                        case "Admin" -> new Admin(tokens[1].trim(), tokens[0].trim(), tokens[2].trim(), tokens[3].trim(), tokens[4].trim());
                        default -> null;
                    };
                return account;
                }
            }
        }
        return null;
    }
}