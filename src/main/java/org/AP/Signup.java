package org.AP;

import java.util.Scanner;

public class Signup {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello welcome to our application!");
        System.out.println("choose your role: ");
        System.out.println("Artist");
        System.out.println("User");
        System.out.println("Admin");
        String role = scan.nextLine();
        System.err.println("enter your name: ");
        String name = scan.nextLine();
        System.out.println("choose a username: ");
        String username = scan.nextLine();
        System.out.println("choose a password: ");
        String password = scan.nextLine();
        System.out.println("enter your email: ");
        String email = scan.nextLine();
        System.err.println("enter your age: ");
        int age = scan.nextInt();

        System.err.println(name);
        System.err.println(age);
        System.err.println(username);
        System.err.println(password);
        System.err.println(email);
        System.err.println(role); 

        Account artist = new Account ();
    }
}