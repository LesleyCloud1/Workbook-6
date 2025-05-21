package com.pluralsight;

import java.util.Objects;

//The Person class represents a person with a name and age.
// Implements Comparable so we can sort people naturally by name.
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    //Constructor: used to create a new Person object with a name and age.
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Getter methods to access private fields (encapsulation)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }

    //Returns the full name of the person
    public String getFullName() {
        return firstName + " " + lastName;
    }

    //This method is called when you print the object
    @Override
    public String toString() {
        return getFullName() + ", Age: " + age;
    }

    //This is used by Collections.sort() to define the natural order
    //We sort by last name first, then first name, then age.
    @Override
    public int compareTo(Person other) {
        int last = this.lastName.compareTo(other.lastName);
        if (last != 0) return last;

        int first = this.firstName.compareTo(other.firstName);
        if (first != 0) return first;

        return Integer.compare(this.age, other.age);
    }

    //Optional but important: allows us to compare two Person objects properly
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                firstName.equals(person.firstName) &&
                lastName.equals(person.lastName);
    }

    //Also needed if we override equals used in hash-based collections like HashSet
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
