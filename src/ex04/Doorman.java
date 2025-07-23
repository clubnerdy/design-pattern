package ex04;

public class Doorman {

    public static Doorman instance = new Doorman();
    // heap 공간에 있는 Doorman 타입의 쫓아내 메서드가 먼저 생긴다.
    // 그리고 instance(Doorman)가 static에 뜬다.
    // 여기서 instance는 Doorman 타입의 쫓아내 메서드가 있는 heap공간의 주소를 가르킨다.

    private Doorman() {}

    public  void 쫓아내(Animal a) {
        System.out.println(a.getName() + " 나가!!!");
    }
}
