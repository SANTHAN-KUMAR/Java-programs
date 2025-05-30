
import java.util.Scanner;

public class abstraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    }
}

abstract class Vehicle {
    int num;
    String name;
    public abstract void PrintName(); //no main logic here
    public abstract void PrintNum();  //no main logic here

    public void ConcreteMethod() {
        System.out.println("This is a concrete method in the abstract class.");
    }
}

class details extends Vehicle {
    @Override
    public void PrintName() {
        //main logic here
        System.out.println("Name: " + name);
    }

    @Override
    public void PrintNum() {
        //main logic here
        System.out.println("Number: " + num);
    }
}