package petcc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.model.Student;
import petcc.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Optional<Student> findById(Integer id) {
        return studentRepository.findById(id);
    }
    public Optional<Student> findByCpf(String cpf) { return studentRepository.findByCpf(cpf); }
    public List<Student> findAll() { return studentRepository.findAll(); }
    public List<Student> findByName(String name) { return studentRepository.findByName(name); }

    public Student save(Student student) { return studentRepository.save(student); }
    public void deleteById(Integer id) { studentRepository.deleteById(id); }
    public void deleteByCpf(String cpf) { studentRepository.deleteByCpf(cpf); }
    public void delete(Student student) { studentRepository.delete(student); }
}
