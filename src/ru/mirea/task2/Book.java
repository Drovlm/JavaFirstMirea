package ru.mirea.task2;

import java.util.Scanner;

    public class Book {

        public static void main(String[] args) {
            String A1, A2, T1, T2;
            int Y1, Y2;
            System.out.println("Enter Title 1: ");
            Scanner scanner = new Scanner(System.in);
            T1 = scanner.nextLine();
            System.out.println("Enter author 1: ");
            scanner = new Scanner(System.in);
            A1 = scanner.nextLine();
            System.out.println("Enter his year of writing: ");
            scanner = new Scanner(System.in);
            Y1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Title 2: ");
            scanner = new Scanner(System.in);
            T2 = scanner.nextLine();
            System.out.println("Enter author 2: ");
            scanner = new Scanner(System.in);
            A2 = scanner.nextLine();
            System.out.println("Enter his year of writing: ");
            scanner = new Scanner(System.in);
            Y2 = Integer.parseInt(scanner.nextLine());

            System.out.println("\nBiik title1 is: " + T1);
            System.out.println("His author is: " + A1);
            System.out.println("Year of writing is: " + Y1);

            System.out.println("\nBiik title2 is: " + T2);
            System.out.println("His author is: " + A2);
            System.out.println("Year of writing is: " + Y2);

            if (Y1 > Y2) {
                System.out.println(T1 + " Older thin " + T2);
            } else {
                System.out.println(T2 + " Older thin " + T1);
            }
        }
    }