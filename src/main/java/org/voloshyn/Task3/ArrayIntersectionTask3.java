package org.voloshyn.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayIntersectionTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < size1; i++) {
            set1.add(arr1[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < size2; i++) {
            set2.add(arr2[i]);
        }
        set1.retainAll(set2);
        System.out.println("The common elements are: ");
        for (int num : set1) {
            System.out.print(num + " ");
        }
        HashSet<Double> set3 = new HashSet<>();
        for (int num : set1) {
            set3.add((double) num);
        }
        set3.add(3.14);
        set3.remove(2.0);
        set3.add(4.0);
        set3.remove(4.5);
        set3.remove(3.14);
        set3.add(2.5);
        set3.add(1.0);
        ArrayList<Double> list = new ArrayList<>(set3);
        Collections.sort(list);
        System.out.println("\nThe elements of the list are:");
        for (double num : list) {
            System.out.print(num + " ");
        }
        try {
            int a = 10 / 0; //ignore warning
        } catch (ArithmeticException e) {
            System.out.println("\n" + e.getMessage() + ": Division by zero is not allowed.");
        }
    }
}
