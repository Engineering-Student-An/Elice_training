package week11.ch11_4.training2;

import com.elice.post.domain.Member;
import com.elice.post.dto.SignUpDto;
import com.elice.post.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 지시사항에 따라 기능을 작성해 주세요.
    public Member signUp(SignUpDto signUpDto) {
        if(!memberRepository.existsByNickname(signUpDto.getNickname()) 
        && !memberRepository.existsByEmail(signUpDto.getEmail())) {
            return memberRepository.save(signUpDto.toEntity());
        } else {
            return memberRepository.save(null);
        }
    }

}
