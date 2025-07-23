package ex08.push.pub;

import ex08.push.sub.Customer;

public interface Mart { // Publisher
    // 1. 구독 (컬렉션에 저장) subscribe
    void add(Customer customer);

    // 2. 구독취소
    void remove(Customer customer);

    // 3. 출판
    void recieve();

    // 4. 알림
    void notify(String msg);
}
