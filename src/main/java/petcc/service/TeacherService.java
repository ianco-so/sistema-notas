package petcc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.model.Teacher;
import petcc.repository.TeacherRepository;
import java.util.Optional;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Optional<Teacher> findById(Integer id) { return teacherRepository.findById(id); }

    public Optional<Teacher> findByCpf(String cpf) { return teacherRepository.findByCpf(cpf); }

    public List<Teacher> findByName(String name) { return teacherRepository.findByName(name); }

    public List<Teacher> findAll() { return teacherRepository.findAll(); }

    public Teacher save(Teacher teacher) { return teacherRepository.save(teacher); }

    public void deleteById(Integer id) { teacherRepository.deleteById(id); }

    public void deleteByCpf(String cpf) { teacherRepository.deleteByCpf(cpf); }
}
