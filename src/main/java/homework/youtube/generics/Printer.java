package homework.youtube.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class GenericPrinter<T>{

    private T printMe;

    public GenericPrinter(T printThis){
        printMe = printThis;
    }

    public void printMe(){
        System.out.println(printMe);
    }
}

abstract class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal implements Serializable{
    void walk(){
        System.out.println("walking");
    }
}

class Cat extends Animal implements Serializable{
    void purr(){
        System.out.println("purring");
    }
}

class AnimalPrinter<T extends Animal & Serializable>{
    T animal;

    public AnimalPrinter(T animal){
        this.animal = animal;
    }

    public void printMe(){
        System.out.println(animal);
    }
}

public class Printer{
    public static void main(String[] args){
        GenericPrinter<Integer> integerGenericPrinter = new GenericPrinter<>(25);
        integerGenericPrinter.printMe();
        GenericPrinter<String> stringGenericPrinter = new GenericPrinter<>("25");
        stringGenericPrinter.printMe();
        GenericPrinter<Double> doubleGenericPrinter = new GenericPrinter<>(Double.valueOf("23.00"));
        doubleGenericPrinter.printMe();
        List intList = new ArrayList();
        intList.add("Priya");
        Cat cat = new Cat();
        Dog dog = new Dog();
        returnAnimal(cat,dog);
    }

    public static <T extends Animal,V extends Animal> void returnAnimal(T dog,V cat){
        dog.eat();
        cat.eat();
    }
}
