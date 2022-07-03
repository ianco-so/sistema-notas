package petcc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.model.Subject;
import petcc.model.Teacher;
import petcc.repository.SubjectRepository;

import java.util.Optional;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private TeacherService teacherService;

    public Optional<Subject> findById(Integer id) { return this.subjectRepository.findById(id); }

    public Optional<Subject> findByName(String name) { return this.subjectRepository.findByName(name); }

    public List<Subject> findAll() { return this.subjectRepository.findAll(); }

    public Optional<Subject> findByTeacher(Integer id) {
        Optional<Teacher> teacher = this.teacherService.findById(id);
        if (teacher.isPresent()) return this.subjectRepository.findByTeacher(teacher.get());
        return null;
    }

    public void save(Subject subject) { this.subjectRepository.save(subject); }

    public void deleteById(Integer id) { this.subjectRepository.deleteById(id); }
}