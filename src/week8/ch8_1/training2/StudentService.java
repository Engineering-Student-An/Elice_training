package week8.ch8_1.training2;

import org.springframework.stereotype.Service;
import java.util.List;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
    
    // 지시사항에 따라 코드를 작성해 보세요.
    private final StudentRepository studentRepository;
    
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}