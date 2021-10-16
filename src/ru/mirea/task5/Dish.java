package ru.mirea.task5;

import java.util.Scanner;

public class Dish<X> {
    public static void main(String[] args) {
   String Plate, Cup;

        int D,C,S;
        String White, Black;
    String big, small;
        System.out.println("Enter 1 to Take a Plate or 2 to Take a Cup: ");
        Scanner scanner = new Scanner(System.in);
        D = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter 3 for white color or 4 for Black color: ");
        scanner = new Scanner(System.in);
        C = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter 5 to Big Size or 6 to SmAll: ");
        scanner = new Scanner(System.in);
        S = Integer.parseInt(scanner.nextLine());



        if (D == 1) {
            if (C == 3) {
                if (S == 5) {
                    System.out.println("Your Chose is a Big White Plate ");
                } if (S == 6) {
                    System.out.println("Your Chose is a Small White Plate");
                }

            } if (C == 4) {
                if (S == 5) {
                    System.out.println("Your Chose is a Big Black Plate ");
                } if (S == 6) {
                    System.out.println("Your Chose is a Small Black Plate");
                }
                }}

            if (D == 2){
                if (C == 3) {
                    if (S == 5) {
                        System.out.println("Your Chose is a Big White Cup");
                    } if (S == 6) {
                        System.out.println("Your Chose is a Small White Cup");
                    }

                } if (C == 4) {
                    if (S == 5) {
                        System.out.println("Your Chose is a Big Black Cup");
                    } if (S == 6) {
                        System.out.println("Your Chose is a Small Black Cup");
                    }
                }

            }
  }
}
