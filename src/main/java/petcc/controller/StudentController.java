package petcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petcc.model.Student;
import petcc.service.StudentService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) { this.studentService = studentService; }

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Student> students = studentService.findAll();
        return ResponseEntity.ok(students);
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<?> findById(Integer id) {
        Optional<Student> student = studentService.findById(id);
        return ResponseEntity.ok(student);
    }

    @GetMapping(value = "/find-cpf/{cpf}")
    public ResponseEntity<?> findByCpf(String cpf) {
        Optional<Student> student = studentService.findByCpf(cpf);
        return ResponseEntity.ok(student);
    }

    @GetMapping(value = "/find-nome/{name}")
    public ResponseEntity<?> findByNome(String name) {
        List<Student> students = studentService.findByName(name);
        return ResponseEntity.ok(students);
    }

    @GetMapping(value = "/save")
    public ResponseEntity<?> save(@RequestBody @Valid Student student) {
        Student saveStudent = studentService.save(student);
        return ResponseEntity.ok(saveStudent);
    }

    @DeleteMapping(value = "/delete-id/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id) {
        studentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete-cpf/{cpf}")
    public ResponseEntity<?> deleteByCpf(@PathVariable String cpf) {
        studentService.deleteByCpf(cpf);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{student}")
    public ResponseEntity<?> delete(@PathVariable Student student) {
        studentService.delete(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}