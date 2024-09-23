package week13.ch13_1.training5;

import com.elice.member.Member;
import com.elice.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public Member login(String name, String password) {

        Member findMember = memberRepository.findByName(name)
                .filter(member -> member.getPassword().equals(password)).orElse(null);

        return findMember;
    }
}