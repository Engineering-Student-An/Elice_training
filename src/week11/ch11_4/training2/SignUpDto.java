package week11.ch11_4.training2;

import com.elice.post.domain.Member;

public class SignUpDto {
    private String email;
    private String password;
    private String nickname;

    public SignUpDto() {

    }

    public Member toEntity() {
        return new Member(email, password, nickname);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
