package com.app.school.service.Student;

import com.app.school.model.Student;
import com.app.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }

    // Implement other methods
}

