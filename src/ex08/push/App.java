package ex08.push;

import ex08.push.pub.EMart;
import ex08.push.pub.LotteMart;
import ex08.push.sub.Cus1;
import ex08.push.sub.Cus2;

public class App {
    public static void main(String[] args) {
        // 1. 객체 초기화
        LotteMart lotteMart = new LotteMart();
        EMart eMart = new EMart();
        Cus1 cus1 = new Cus1();
        Cus2 cus2 = new Cus2();
        
        // 2. 구독 (구독의 행위자는 고객)
        lotteMart.add(cus1);
        lotteMart.add(cus2);

        eMart.add(cus1);
        eMart.add(cus2);

        // 3. 구독 취소
        lotteMart.remove(cus2);

        // 4. 출판 (누가 할지는 나중에 정하면 됨)
        new Thread(() -> {
            lotteMart.recieve();
        }).start();
        new Thread(() -> {
            eMart.recieve();
        }).start();
    }
}
