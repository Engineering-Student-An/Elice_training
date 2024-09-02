package week11.ch11_1.training2;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;
    
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member signUp(SignUpDto signUpDto) {
        return memberRepository.save(signUpDto.toEntity());
    }
    
    // updateNickname 메서드를 작성해 주세요.
    public Member updateNickname(Long id, String nickname) {
        if(memberRepository.existsByNickname(nickname)) {
            Member member = memberRepository.findById(id).orElseThrow(() -> new RuntimeException());
            member.setNickname(nickname);

            return member;
        }

        return null;
    }
}
