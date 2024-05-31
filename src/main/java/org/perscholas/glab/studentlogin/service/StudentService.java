package org.perscholas.glab.studentlogin.service;

import org.perscholas.glab.studentlogin.dto.StudentDto;
import org.perscholas.glab.studentlogin.model.Student;

import java.util.List;

public interface StudentService {

    // Notice the saveStudent() method receives the StudentDto object as an argument and not a Student object.
    // This means that the Student object was mapped to a studentDto object.
    void saveStudent(StudentDto studentDto);
    Student findStudentByEmail(String email);
    List<StudentDto> findAllStudents();
}

