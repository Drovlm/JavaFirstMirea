package ru.mirea.task10;

import java.util.Scanner;

public class MS {
    static void printArr(int[] arr, int k) {
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");
    }

    static void printSeqUtil(int n, int k,
                             int len, int[] arr) {
        if (len == k) {
            printArr(arr, k);
            return;
        }
        int i = (len == 0) ? 1 : arr[len - 1] + 1;

        len++;
        while (i <= n) {
            arr[len - 1] = i;
            printSeqUtil(n, k, len, arr);
            i++;
        }
        len--;
    }

    static void printSeq(int n, int k) {

        int[] arr = new int[k];

        int len = 0;
        printSeqUtil(n, k, len, arr);
    }

    static public void main(String[] args) {

        int k, n;

        System.out.println("Enter k: ");
        Scanner scanner = new Scanner(System.in);
        k = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter n: ");
        scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        printSeq(n, k);

        /*int fsum, S = 0;
        System.out.println("Enter fsum: ");
        scanner = new Scanner(System.in);
        fsum = Integer.parseInt(scanner.nextLine());*/

        /*int i = (int) Math.pow(10, k );
        while (i < Math.pow(10, k)) {
            int ssum = 0, num = i;;

            while (num<0) {
                ssum += num % 10;
                num /= 10;
            }

           if (ssum <= fsum) {
                System.out.print(" " +i);
              S++;
            }
            i++;
        }
            System.out.print("\nCount of this numbers: " +S);*/

   /* int count, temp;

    Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
    count = scan.nextInt();

    int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) {
        }}*/

   /*     LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            Integer val = sc.nextInt();
            linkedList.add(val);*/

        int X;

        System.out.print("Enter 0 in ascending order or 1 in descending order: \n");
        scanner = new Scanner(System.in);
        X = (char) Integer.parseInt(scanner.nextLine());

        if (X == 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i+ " ");
            }
        }
        if (X == 1) {
            for (int i = n; i >= 1; i--) {
                System.out.print(+ i);
            }
        }


        int d, i;
        d = 0;
        for (i = 1; i <= n; i++) {
            d = d + i;
        }
        System.out.println("\nd= " + d);


        int num = d;
        boolean flag = false;
        for (i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + ": YES, is a prime number");

        else
            System.out.println(num + ": NO, isn't a prime number");


        String primeNumbers = "";

        for (i = 1; i <= d; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers to d :");
        System.out.println(primeNumbers);


        int P, Y;

        System.out.print("The number of numbers you want to enter: ");
        scanner = new Scanner(System.in);
        Y = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter " + Y + " numbers: ");
        scanner = new Scanner(System.in);
        for (i = 0; i < Y; i++) {
            P = Integer.parseInt(scanner.nextLine());

            if (P % 2 == 1)
                System.out.println("Number " + P + " is odd.");
        }


        int N;
        System.out.print("Enter N: \n");
        scanner = new Scanner(System.in);
        N = Integer.parseInt(scanner.nextLine());

            for (i = N; i >= 0; i--) {
                System.out.print(i+" ");
            }
        }
    }









