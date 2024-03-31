package com.app.school.controller;

import com.app.school.model.Dto.UserDto;
import com.app.school.model.Student;
import com.app.school.model.Teacher;
import com.app.school.service.Authentication.AuthService;
import com.app.school.service.Student.StudentService;
import com.app.school.service.Teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Router {

    @Autowired
    private StudentService studentService;

    @Autowired
    private AuthService authService;

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

//    @PostMapping("/auth/register")
//    public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {
        // Implementasi logika registrasi pengguna di sini

//        return ""
//    }

//    @PostMapping("/auth/login")
//    public ResponseEntity<?> loginUser(@RequestBody LoginRqeuest loginRequest) {
//        // Implementasi logika login pengguna di sini
//    }

    @GetMapping("/teacher")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

}