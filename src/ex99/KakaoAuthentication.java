package ex99;

public class KakaoAuthentication extends Authentication {

    public UserProfile login() {
        System.out.println("카카오 로그인 완료");
        return new KakaoProfile(1, "ssar");
    }
}
