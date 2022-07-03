package petcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petcc.model.Student;
import petcc.model.Subject;
import petcc.service.SubjectService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/diciplina")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    public SubjectController(SubjectService subjectService) { this.subjectService = subjectService; }

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Subject> subjects = this.subjectService.findAll();
        return ResponseEntity.ok(subjects);
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<?> findById(Integer id) {
        Optional<Subject> subject = this.subjectService.findById(id);
        return ResponseEntity.ok(subject);
    }

    @GetMapping(value = "/find-nome/{nome}")
    public ResponseEntity<?> findByNome(String name) {
        Optional<Subject> subject = this.subjectService.findByName(name);
        return ResponseEntity.ok(subject);
    }

    @GetMapping(value = "/find-teacher/{id}")
    public ResponseEntity<?> findByTeacher(Integer id) {
        Optional<Subject> subject = this.subjectService.findByTeacher(id);
        return ResponseEntity.ok(subject);
    }

    @GetMapping(value = "/save")
    public ResponseEntity<?> save(@RequestBody @Valid Subject subject) {
        this.subjectService.save(subject);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id) {
        this.subjectService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}