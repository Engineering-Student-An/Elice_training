package week8.ch8_1.training2;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", "alice@example.com"));
        students.add(new Student(2, "Bob", "bob@example.com"));
        students.add(new Student(3, "Charlie", "charlie@example.com"));
        return students;
    }
}