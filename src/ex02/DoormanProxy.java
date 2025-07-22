package ex02;

public class DoormanProxy {
    private Doorman doorman; // has => 도어맨 프록시가 도어맨을 가졌다

    public DoormanProxy(Doorman doorman) {
        this.doorman = doorman;
    } // 4~8 결합코드 == 스프링에서 DI라고 부름

    public void 쫓아내(Animal a) {
        System.out.println("안녕"); // 해당하는 라인에서 프록시에서 처리해야하는 것을 넣음
        doorman.쫓아내(a);
    }
}
