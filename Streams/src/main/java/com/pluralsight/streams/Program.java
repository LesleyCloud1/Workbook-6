package com.pluralsight.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Create a list of 10 people
        List<Person> people = new ArrayList<>();
        people.add(new Person("Lesley", "Solorzano", 26));
        people.add(new Person("Sri", "Soma", 33));
        people.add(new Person("Noah", "Hughes", 30));
        people.add(new Person("Emma", "Bennett", 25));
        people.add(new Person("Oliver", "Adams", 19));
        people.add(new Person("Ava", "Carter", 31));
        people.add(new Person("Elijah", "Collins", 28));
        people.add(new Person("Sophia", "Parker", 20));
        people.add(new Person("James", "Stewart", 26));
        people.add(new Person("Isabella", "Wright", 24));

        Scanner scanner = new Scanner(System.in);

        //Prompt the user for a name to search
        System.out.print("Enter a first or last name to search: ");
        String input = scanner.nextLine().toLowerCase();

        List<Person> matched = new ArrayList<>();

        //Search using a traditional loop
        for (Person person : people) {
            if (person.getFirstName().toLowerCase().contains(input) ||
            person.getLastName().toLowerCase().contains(input)) {
                matched.add(person);
            }
        }
        //Display matched people
        System.out.println("\nSearch Results:");
        if (matched.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (Person person : matched) {
                System.out.println(person);
            }
        }

        //Calculate average, max, and min age
        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person person : people) {
            int age = person.getAge();
            totalAge += age;
            if (age > oldest) oldest = age;
            if (age < youngest) youngest = age;
        }

        double averageAge = (double) totalAge / people.size();

        //Display results
        System.out.printf("\nAverage Age: %.1f\n", averageAge);
        System.out.println("Oldest Age: " + oldest);
        System.out.println("Youngest Age: " + youngest);

        scanner.close();
    }
}