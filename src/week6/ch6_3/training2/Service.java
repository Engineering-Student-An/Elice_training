package week6.ch6_3.training2;

interface Service {
    String getUserName();
}

class UserService implements Service {
    @Override
    public String getUserName() {
        return "홍길동";
    }
}
