package com.app.school.service.Teacher;

import com.app.school.model.Dto.TeacherDto;
import com.app.school.model.Teacher;
import com.app.school.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return null;
    }

    @Override
    public Teacher createTeacher(TeacherDto teacherDto) {
        return null;
    }

    @Override
    public Teacher updateTeacher(Long id, TeacherDto teacherDto) {
        return null;
    }

    @Override
    public void deleteTeacher(Long id) {

    }

    // Implementasi metode lainnya
}
