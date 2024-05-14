package io.mkm.student.repository;

import io.mkm.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteByEmail(String email);

    Student findByEmail(String email);
}
