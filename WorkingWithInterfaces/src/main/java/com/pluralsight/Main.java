package com.pluralsight;

import java.util.*;
import java.util.stream.Collectors;

//This is the main program that creates and works with Person objects.
public class Main {
    public static void main(String[] args) {

        //Create a list of Person objects (like a list of family members)
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Lesley", "Solorzano", 26));
        myFamily.add(new Person("Sri", "Soma", 33));
        myFamily.add(new Person("Elvira", "Aslan", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aiden", 17));

        //Print the list exactly as entered (unsorted)
        System.out.println("== Original List ==");
        myFamily.forEach(System.out::println); // foreach loop in a short format

        //Sort by name using the compareTo() method in Person
        System.out.println("\n== Sorted by Name ==");
        Collections.sort(myFamily); // uses natural order from compareTo
        myFamily.forEach(System.out::println);

        //Sort by age using a Comparator and streams
        System.out.println("\n== Sorted by Age ==");
        myFamily.stream() // create a stream from the list
                .sorted(Comparator.comparingInt(Person::getAge)) // sort by age
                .forEach(System.out::println); // print each person

        //Filter show only people older than 15
        System.out.println("\n== People over Age 15 ==");
        myFamily.stream()
                .filter(p -> p.getAge() > 15) // keep only if age > 15
                .forEach(System.out::println);

        //Map transform each Person to their first name only
        System.out.println("\n== First Names Only ==");
        myFamily.stream()
                .map(Person::getFirstName) //convert each Person to just their first name
                .forEach(System.out::println);
    }
}