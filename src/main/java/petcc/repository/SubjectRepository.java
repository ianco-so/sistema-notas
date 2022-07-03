package petcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.model.Subject;
import petcc.model.Teacher;

import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    Optional<Subject> findByTeacher(Teacher teacher);
    Optional<Subject> findByName(String name);
}