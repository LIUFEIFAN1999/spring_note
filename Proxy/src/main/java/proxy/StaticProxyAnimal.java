package proxy;

import domain.Animal;

public class StaticProxyAnimal implements Animal {
    Animal animal;

    public StaticProxyAnimal(Animal animal){
        this.animal = animal;
    }

    public void eat() {
        System.out.println("before " +animal.getClass().getName().substring(7)+" eating");
        animal.eat();
        System.out.println("after " +animal.getClass().getName().substring(7)+" eating");
    }
}
