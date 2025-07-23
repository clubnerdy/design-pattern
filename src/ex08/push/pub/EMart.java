package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class EMart implements Mart {

    // 구독자 명단 (컬렉션에 저장되는 것들)
    private List<Customer> customerList = new ArrayList<>();

    // 구독 등록
    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    // 구독 취소
    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }

    // 출판
    @Override
    public void recieve() {
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notify("EMart : 딸기"); // 출판이 끝나면 고객에게 알림을 보냄
    }

    // 알림
    @Override
    public void notify(String msg) {
        for (Customer customer : customerList) {
            customer.update(msg);
        }
    }
}