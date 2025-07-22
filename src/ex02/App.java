package ex02;

import ex01.Tiger;

public class App {
    public static void main(String[] args) {
        // 1. init
        Mouse m1 = new Mouse();
        Cat c1 = new Cat();
        Doorman d1 = new Doorman();
        DoormanProxy dp = new DoormanProxy(d1);

        dp.쫓아내(m1);
        dp.쫓아내(c1);
    }
}
