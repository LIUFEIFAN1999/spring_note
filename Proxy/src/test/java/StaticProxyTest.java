import domain.Animal;
import domain.Cat;
import domain.Dog;
import proxy.StaticProxyAnimal;

public class StaticProxyTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal proxyDog = new StaticProxyAnimal(dog);
        Animal proxyCat = new StaticProxyAnimal(cat);
        proxyDog.eat();
        proxyCat.eat();
    }
}
