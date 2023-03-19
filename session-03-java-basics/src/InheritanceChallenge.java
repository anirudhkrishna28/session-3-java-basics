package io.javabrains.javabasics;

import java.util.Scanner;

class Animal{
    String name;
    int age;
    Animal(String name,int age)
    {
        this.age=age;
        this.name=name;
    }
    public String makeSound(String msg)
    {
        return msg;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age ;
    }
}
class Dog extends Animal{
    String breed;

    Dog(String name, int age,String breed) {
        super(name, age);
        this.breed=breed;
    }

    public String makeSound(String msg)
    {
        System.out.println("The dog barks");
        return msg;
    }

}

class Cat extends Animal
{
    int lives;
    Cat(String name, int age,int lives) {
        super(name, age);
        this.lives = lives;
    }
    public String makeSound(String msg)
    {
        System.out.println("The cat meows");
        return msg;
    }
}


public class InheritanceChallenge {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Animal cat = new Animal("cat",10);
        Animal dog = new Animal("dog",5);
        Animal lion = new Animal("lion",12);
        Animal  tiger= new Animal("tiger",9);
        Animal [] animals = {cat,dog,lion,tiger};
        for(Animal a:animals)
        {
            System.out.println("Enter sound of "+a.name);
            System.out.println(a.toString()+", sound="+a.makeSound(sc.nextLine())+"}");
        }
    }

}
