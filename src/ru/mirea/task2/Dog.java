package ru.mirea.task2;

public class Dog
{
    public final String name;
    public int age;
    public double weight;
    public boolean isAlive;

    public Dog(String theName, int theAge, double theWeight, boolean isThisAlive)
    {
        name = theName;
        age = theAge;
        weight = theWeight;
        isAlive = isThisAlive;
    }

    public String toString()
    {
        return "This dog is named " + name;
    }
}