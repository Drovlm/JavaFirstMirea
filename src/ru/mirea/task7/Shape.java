package ru.mirea.task7;


import java.util.Scanner;

public class Shape {
    public static void main(String[] arg) {
        double L, B, S, R;

        try (Scanner user_input = new Scanner(System.in)) {

System.out.print("Enter length: ");
              L = user_input.nextFloat();
System.out.print("Enter Breadth: ");
              B = user_input.nextFloat();
                Rectangle r = new Rectangle(L, B);

System.out.print("\nEnter Side: ");
              S = user_input.nextFloat();
                     Square s = new Square(S);

System.out.print("\nEnter Radius: ");
              R = user_input.nextFloat();
                     Circle c = new Circle(R);

        System.out.println("\nRectangle Area : " + r.getArea());
        System.out.println("Square Area : " + s.getArea());
        System.out.println("Circle Area : " + c.getArea());
        System.out.println();

        if ((r.getArea() > c.getArea()) && (r.getArea() > s.getArea()))
        {
            System.out.println("Rectangle has the largest area.");
        }
        else if( s.getArea() > c.getArea() )
        {
            System.out.println("Square has the largest area.");
        }
        else
        {
            System.out.println("Circle has the largest area.");
        }
    }
}}

class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }
}

class Square
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    double getArea()
    {
        return side * side;
    }
}

class Circle
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getArea() {
        return (3.14) * radius * radius;
    }
}