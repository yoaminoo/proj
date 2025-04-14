package org.AP;

import java.util.Scanner;

class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scan.nextLine();
        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        // must call a meth from Account.java for checking the username and password
        // and if they are correct show that mf page
    }
}