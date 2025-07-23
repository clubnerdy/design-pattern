package ex06.notification;

public class EmailNotifier implements Notifier { // 강제성 부여
    
    private Notifier notifier;

    public EmailNotifier() {}

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(){
        System.out.println("이메일 알림");
        if(notifier != null)notifier.send();
    }
}
