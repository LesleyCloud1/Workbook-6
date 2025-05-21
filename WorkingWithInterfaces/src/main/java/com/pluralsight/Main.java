package com.pluralsight;

public class Main {
    import java.util .*;

    public class Main {
        public static void main(String[] args) {
            List<Person> myFamily = new ArrayList<>();
            myFamily.add(new Person("Lesley", "Solorzano", 26));
            myFamily.add(new Person("Sri", "Soma", 33));
            myFamily.add(new Person("Elvira", "Aslan", 14));
            myFamily.add(new Person("Ian", "Auston", 16));
            myFamily.add(new Person("Zephaniah", "Hughes", 9));
            myFamily.add(new Person("Ezra", "Aiden", 17));

            // Before sorting
            System.out.println("Before sorting:");
            for (Person person : myFamily) {
                System.out.println(person);
            }

            // Sort using compareTo
            Collections.sort(myFamily);

            // After sorting
            System.out.println("\nAfter sorting:");
            for (Person person : myFamily) {
                System.out.println(person);
            }
        }
    }
}
