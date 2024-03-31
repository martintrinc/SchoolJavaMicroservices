package com.app.school.service.Teacher;

import com.app.school.model.Dto.TeacherDto;
import com.app.school.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Long id);
    Teacher createTeacher(TeacherDto teacherDto);
    Teacher updateTeacher(Long id, TeacherDto teacherDto);
    void deleteTeacher(Long id);
}