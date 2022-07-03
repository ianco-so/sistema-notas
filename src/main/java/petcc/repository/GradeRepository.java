package petcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.model.Grade;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
}