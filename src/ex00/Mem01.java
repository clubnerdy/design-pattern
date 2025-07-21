package ex00;

class Animal {
    static String name = "강아지"; // static 공간에 name 뜸

    void speak() { // speack 메서드 스택 생성
        String sound = "멍멍"; // stack 공간에 sound 잠깐 뜸
        System.out.println(sound);
    } // speak 메서드 스택 소멸
}

public class Mem01 {

    public static void main(String[] args) {
        System.out.println(Animal.name); // static 공간에 name 찾음
        Animal a = new Animal(); // heap 생성 (speak 메모리에 뜸)
        a.speak();
    }
}
