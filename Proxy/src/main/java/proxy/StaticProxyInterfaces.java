package proxy;

import domain.Animal;
import domain.Person;

public class StaticProxyInterfaces implements Animal, Person {
    Animal animal;
    Person person;

    public StaticProxyInterfaces(Animal animal) {
        this.animal = animal;
    }

    public StaticProxyInterfaces(Person person) {
        this.person = person;
    }

    public void eat() {
        System.out.println("before " +animal.getClass().getName().substring(7)+" eating");
        animal.eat();
        System.out.println("after " +animal.getClass().getName().substring(7)+" eating");
    }

    public void speak() {
        System.out.println("before " +person.getClass().getName().substring(7)+" speaking");
        person.speak();
        System.out.println("after " +person.getClass().getName().substring(7)+" speaking");
    }
}
