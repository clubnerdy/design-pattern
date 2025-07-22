package ex02;

public class Doorman {
    
    // 객체의 책임, 메서드
    public  void 쫓아내(Animal a) {
        System.out.println(a.getName() + " 나가!!!");

        // 책임을 여러개 만들어도 됌! 하나만 줄 수 있음 베스트고
        // 여러개를 줄때는 관련성 있는 추상화를 통해 묶어서 책임을 주어야한다.
    }
}
