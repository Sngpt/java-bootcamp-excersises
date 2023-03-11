package assignments;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

import java.sql.SQLOutput;
import java.time.LocalDateTime;

import java.util.Comparator;
import java.util.Objects;

public class EqualsAndHashCode {

    public static void main(String[] args) {

        Person p1 = new Person("Gowri","Desu",35,LocalDateTime.now());
        Person p2 = new Person("Gowri","Desu",35,LocalDateTime.now());

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode()==p2.hashCode());

    }
}

class Person {
    String firstName;
    String lastName;
    int age;
    LocalDateTime lastModifiedDate;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Person(String firstName, String lastName, int age, LocalDateTime lastModifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = lastModifiedDate;
    }



    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public boolean equals(Object person2) {
        if(this == person2) {
            return true;
        }
        if(person2 != null && person2.getClass() == getClass()) {
            Person o = (Person) person2;
            return Objects.equals(this.firstName,o.firstName) && Objects.equals(this.lastName,o.lastName) && Objects.equals(this.age,o.age);
        }
        return false;
    }
}
