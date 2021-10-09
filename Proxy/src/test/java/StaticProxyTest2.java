import domain.Cat;
import domain.Student;
import proxy.StaticProxyInterfaces;

public class StaticProxyTest2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Student student = new Student();
        StaticProxyInterfaces proxyCat = new StaticProxyInterfaces(cat);
        StaticProxyInterfaces proxyStudent = new StaticProxyInterfaces(student);
        proxyCat.eat();
        proxyStudent.speak();
    }
}
