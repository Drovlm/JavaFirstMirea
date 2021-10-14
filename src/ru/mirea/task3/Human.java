package ru.mirea.task3;

import java.util.Scanner;

public class Human {
    public static void main(String[] args) {
        System.out.print("Enter in Name: ");
        Scanner Name = new Scanner(System.in);
        Humans human = new Humans();
        human.Name = Name.nextLine();

        System.out.print("\nEnter  Age: ");
        Scanner Age = new Scanner(System.in);
        human.Age = Age.nextInt();

        System.out.print("\nEnter his Height: ");
        Scanner Height = new Scanner(System.in);
        human.Height = Height.nextFloat();

        System.out.print("\nEnter in Weight: ");
        Scanner Weight =  new Scanner(System.in);
        human.Weight = Weight.nextFloat();

        human.Talk();

    }
}

class Humans
{
    String Name;
    int Age;
    float Height;
    float Weight;

    void Talk()
    {
        System.out.println("Name: "+Name+"\nAge: "+Age+"\nHeight: "+Height+"\nWeight: "+Weight+"\n");
    }
   }