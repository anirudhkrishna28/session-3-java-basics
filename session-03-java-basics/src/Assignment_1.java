package io.javabrains.javabasics;

import java.util.ArrayList;

abstract class Animal{
    String name;
    double weight;
    int age;
    boolean iscanivore;

 abstract void feed();

    public Animal(String name, double weight, int age, boolean iscanivore) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.iscanivore = iscanivore;
    }


}
// Lion class
class Lion extends Animal {
    int maneLength;


    public Lion(String name, int weight, int age, int maneLength, boolean carnivore) {
        super(name, weight, age,carnivore);
        this.maneLength = maneLength;
        ;
    }

    public void feed() {
        System.out.println("Eating some meat.");
    }
}

// Tiger class
class Tiger extends Animal {
  int stripeCount;

    public Tiger(String name, int weight, int age, int stripeCount, boolean carnivore) {
        super(name, weight, age,carnivore);
        this.stripeCount = stripeCount;
//        this.carnivore = carnivore;
    }



    public void feed() {
        System.out.println("Eating some meat.");
    }
}

// Bear class
class Bear extends Animal {
    int furThickness;
    boolean carnivore;

    public Bear(String name, int weight, int age, int furThickness, boolean carnivore) {
        super(name, weight, age,carnivore);
        this.furThickness = furThickness;
//        this.carnivore = carnivore;
    }
    public void feed() {
        System.out.println("Eating some honey.");
    }
}

class Enclosure
{
    ArrayList<Animal> carnivore = new ArrayList<>();
    ArrayList<Animal> herbivore = new ArrayList<>();

    @Override
    public String toString() {
        String c = "";
        String h = "";
        for (Animal a:carnivore)
        {
           c+=a.name+" " ;
        }
        for (Animal a:herbivore)
        {
            h+=a.name+" " ;
        }
        return "Enclosure{\n" +
                "carnivore:"+c+"\n"+
                "herbivore:"+h+
                "\n}";
    }

    public  void  add(Animal a)
    {
        if(a.iscanivore)
            carnivore.add(a);
        else
            herbivore.add(a);
    }
}
public class Assignment_1 {
    public static void main(String[] args) {
        Enclosure e = new Enclosure();
        Lion lion1 = new Lion("Simba", 200, 5, 10,true);
        Tiger tiger1 = new Tiger("Tony", 150, 6, 20,true);
        Bear bear1 = new Bear("Yogi", 300, 7, 30,true);

        e.add(lion1);
        e.add(tiger1);
        e.add(bear1);
        System.out.println(e);
    }
}
