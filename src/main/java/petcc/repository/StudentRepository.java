package petcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);
    Optional<Student> findByCpf(String cpf);
    void deleteByCpf(String cpf);
}