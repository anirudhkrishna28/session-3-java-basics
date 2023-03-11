package io.javabrains.javabasics;

/*
1.  Create a class called `Car` with member variables for the make, model, and year of the car.
2.  Create a constructor method for the `Car` class that initializes the member variables.
3.  Create getter methods for the make, model, and year.
4.  Create a `toString` method that returns a string representation of the car in the form "year make model".
5.  In the `main` method of this class, create a `Car` object with a make, model, and year of your choice.
6.  Use the member variables and methods of the `Car` class to print the make, model, and year of the car.
7.  The expected output of the program is:

```
Make: Toyota
Model: Camry
Year: 2020
Details: 2020 Toyota Camry
```

 */
class Car
{
    private String make;
    private int year;
    private String model;

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String toString()
{
    return "Make: "+make+"\n"+"Model: "+model+"\n"+"Year: "+year+"\n"+"Details: "+year+" "+model+" "+make;
//    System.out.println("Make: "+make);
//    System.out.println("Model: "+model);
//    System.out.println("Year: "+year);
//    System.out.println("Details: "+year+" "+model+" "+year);
}

    public Car(String make, String model, int year)
    {
        this.make=make;
        this.year=year;
        this.model=model;
    }


}
public class ClassesAndObjects {


    public static void main(String[] args) {
        Car car = new Car("Audi","Ani",2022);
        System.out.println(car);
    }

}
