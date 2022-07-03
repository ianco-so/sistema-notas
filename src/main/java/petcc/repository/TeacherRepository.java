package petcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.model.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    Optional<Teacher> findByCpf(String cpf);
    List<Teacher> findByName(String name);
    void deleteByCpf(String cpf);
}