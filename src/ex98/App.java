package ex98;

public class App {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Cat c1 = new Cat();
        Doorman d1 = new Doorman();

        // 동물이 침입하려고 했어요!! (email 보내고 쫓아내야함)

        d1.쫓아내(m1);
        d1.쫓아내(c1);
    }
}
