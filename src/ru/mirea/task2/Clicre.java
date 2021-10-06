package ru.mirea.task2;

import java.util.Scanner;

public class Clicre {

        public static void main(String[] args) {
            double r1,r2,A1,A2,C1,C2,D1,D2; //A= Area cricle,  C= Circumference Of A Circle, D= Diameter, r1= Radius 1, r2 = Radius 2
            System.out.print("Enter r1: ");
       try (Scanner user_input = new Scanner(System.in)) {
                r1 = user_input.nextFloat();
                System.out.print("Enter r2: ");
                r2 = user_input.nextFloat();
            }
            A1 = r1 * 3.14 * r1;
            C1 = 3.14 * 2 * r1;
            D1 = 2 * r1;
            System.out.println("\nInformation of Clicre 1: ");
            System.out.println("A1 of cricle is: "+A1);
            System.out.println("C1 of cricle is: "+C1);
            System.out.println("D1 of cricle is: "+D1);

            A2 = r2 * 3.14 * r2;
            C2 = 3.14 * 2 * r2;
            D2 = 2 * r2;
            System.out.println("\nInformation of Clicre 2: ");
            System.out.println("A2 of cricle is: "+A2);
            System.out.println("C2 of cricle is: "+C2);
            System.out.println("D2 of cricle is: "+D2);
       /* System.out.print("Enter r2: ");
        try (Scanner user_input = new Scanner(System.in)) {
            r2 = user_input.nextFloat();
        }
        A2 = r2 * 3.14 * r2;
        C2 = 3.14 * 2 * r2;
        D2 = 2 * r2;
        System.out.println("Area2 of cricle is: "+A2);
        System.out.println("C2 of cricle is: "+C2);
        System.out.println("D2 of cricle is: "+D2);*/

            if(r1 > r2){
                System.out.println("\nClicre1 bigger then Clicre2");
            } else {
                System.out.println("\nClicre2 bigger then Clicre1");
            }
        }
    }

