import domain.*;
import factory.ProxyBeanFactory;

public class DynamicProxyTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Student student = new Student();
        Animal proxyDog = (Animal) new ProxyBeanFactory(dog).getProxyInstance();
        Animal proxyCat = (Animal) new ProxyBeanFactory(cat).getProxyInstance();
        Person proxyStudent = (Person) new ProxyBeanFactory(student).getProxyInstance();
        proxyDog.eat();
        proxyCat.eat();
        proxyStudent.speak();
    }
}
