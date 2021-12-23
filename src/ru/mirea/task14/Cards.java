package ru.mirea.task14;

import java.util.ArrayList;

public class Cards {
    public static void main(String[] args) {
        int P1, P2;
        System.out.print("P1:");

        ArrayList<Integer> list = new ArrayList<Integer>(9);
        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }

        //  Random rand = new Random();
        // rand = new Random();
        while (list.size() > 5) {
            P1 = (int) (Math.random() * 5 + 0);
            System.out.print(" " + list.remove(P1));
        }
        System.out.print("\nP2:");
       list = new ArrayList<Integer>(9);
        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }

        while (list.size() > 5) {
            P2 = (int) (Math.random() * 5 + 0);
            System.out.print(" " + list.remove(P2));
        }
    }
}















