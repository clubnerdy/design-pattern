package ex03;

public class App {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Cat c1 = new Cat();
        TigerAdapter t1 = new TigerAdapter(new OuterTiger());
        Doorman d1 = new Doorman();

        d1.쫓아내(m1);
        d1.쫓아내(c1);
        d1.쫓아내(t1);
    }
}
