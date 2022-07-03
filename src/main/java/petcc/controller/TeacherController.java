package petcc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petcc.model.Teacher;
import petcc.service.TeacherService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) { this.teacherService = teacherService; }

    @GetMapping(value = "/find-id/{id}")
    public ResponseEntity<?> findById(Integer id) {
        Optional<Teacher> teacher = teacherService.findById(id);
        return ResponseEntity.ok(teacher);
    }

    @GetMapping(value = "/find-cpf/{cpf}")
    public ResponseEntity<?> findByCpf(String cpf) {
        Optional<Teacher> teacher = teacherService.findByCpf(cpf);
        return ResponseEntity.ok(teacher);
    }

    @GetMapping(value = "/find-all")
    public ResponseEntity<?> findAll() {
        List<Teacher> teachers = teacherService.findAll();
        return ResponseEntity.ok(teachers);
    }

    @GetMapping(value = "/find-nome/{name}")
    public ResponseEntity<?> findByName(String name) {
        List<Teacher> teachers = teacherService.findByName(name);
        return ResponseEntity.ok(teachers);
    }

    @GetMapping(value = "/save")
    public ResponseEntity<?> save(@RequestBody @Valid Teacher teacher) {
        Teacher saveTeacher = teacherService.save(teacher);
        return ResponseEntity.ok(saveTeacher);
    }

    @GetMapping(value = "/delete-cpf/{cpf}")
    public ResponseEntity<?> deleteByCpf(@PathVariable String cpf) {
        teacherService.deleteByCpf(cpf);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}