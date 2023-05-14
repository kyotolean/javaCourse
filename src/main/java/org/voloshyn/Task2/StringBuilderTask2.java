//4 methods
package org.voloshyn.Task2;

import java.util.Scanner;

public class StringBuilderTask2 {


    public static void main(String[] args) {
        String userName = getUserName();
        String reversedName = reversedMethod(userName);
        String length = lengthMethod(userName);
        System.out.println("Your reversed name is - " + reversedName);
        System.out.println("Your length is - " + length);
    }

    public static String getUserName() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your name -> ");
        return myObj.nextLine();
    }

    public static String reversedMethod(String name) {
        StringBuilder sb = new StringBuilder(name);
        return String.valueOf(sb.reverse());
    }

    public static String lengthMethod(String name) {
        StringBuilder sb = new StringBuilder(name);
        return String.valueOf(sb.length());
    }
}