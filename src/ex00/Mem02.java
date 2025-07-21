package ex00;
// 2. 동적 바인딩
abstract class Car {
    abstract void run();
}

class Ganesis extends Car {
    // 재정의
    void run() {
        System.out.println("Genesis run");
    }
}

class Sonata extends Car { // 소나타는 타입이 두개가 된거다. 소나타, 카
    // 부모가 들고있는 run을 재정의함
    void run() {
        System.out.println("Sonata run");
    }
}

public class Mem02 {
    public static void main(String[] args) {
        Car car1 = new Sonata();
        car1.run();

        Car car2 = new Ganesis();
        car2.run();
    }
}
