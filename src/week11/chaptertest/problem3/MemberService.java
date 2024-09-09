package week11.chaptertest.problem3;

import io.elice.elcademy.member.entity.Member;
import io.elice.elcademy.member.repository.MemberRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 지시사항을 참고하여 코드를 작성해 보세요. 
    public Page<Member> findMembers(int page, int size) {

        PageRequest pageRequest = PageRequest.of(page - 1, size, Sort.by("memberId"));

        return memberRepository.findAll(pageRequest);
    }

    public List<Member> findMemberByEmailEndingWith(String email) {
        return memberRepository.findByEmailEndingWith(email);
    }
}