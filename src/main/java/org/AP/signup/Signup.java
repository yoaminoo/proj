package org.AP;

import java.util.Scanner;

public class Signup {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner scan = new Scanner(System.in);
        P.ln("Hello welcome to our application!");
        P.ln("choose your role: ");
        P.ln("Artist");
        P.ln("User");
        P.ln("Admin");
        String role = scan.nextLine();
        while(!(role.equals("Artist")) && !(role.equals("Admin")) && !(role.equals("User"))) {
            P.ln("Please choose one of the following options:");
            P.ln("Artist");
            P.ln("User");
            P.ln("Admin");
        }
        P.ln("enter your name: ");
        String name = scan.nextLine();
        P.ln("choose a username: ");
        String username = scan.nextLine();
        P.ln("choose a password: ");
        String password = scan.nextLine();
        P.ln("enter your email: ");
        String email = scan.nextLine();
        P.ln("enter your age: ");
        int age = scan.nextInt();

//        Artist artist = new Artist (role, name, username, password, email, age);
    }
}