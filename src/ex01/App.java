package ex01;

public class App {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Tiger t1 = new Tiger();
        Cat c1 = new Cat();
        Doorman d1 = new Doorman();

        d1.쫓아내(m1);
        d1.쫓아내(t1);
        d1.쫓아내(c1);
    }
}
