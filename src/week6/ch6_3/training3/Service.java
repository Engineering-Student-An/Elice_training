package week6.ch6_3.training3;

interface Service {
    String getDescription();
}

class UserService implements Service {
    @Override
    public String getDescription() {
        return "사용자 서비스";
    }
}
