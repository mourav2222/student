package io.mkm.student.controller;

import io.mkm.student.model.Student;
import io.mkm.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudents() {

        //todo
        return service.findAllStudents();
    }

    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student) {

        return service.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete_student/{email}")
    public void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }
}
