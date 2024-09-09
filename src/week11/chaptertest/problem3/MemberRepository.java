package week11.chaptertest.problem3;

import io.elice.elcademy.member.entity.Member;
import io.elice.elcademy.subject.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 지시사항을 참고하여 코드를 작성해 보세요. 
    List<Member> findByEmailEndingWith(String email);
}