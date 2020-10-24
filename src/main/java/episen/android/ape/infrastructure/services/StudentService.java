package episen.android.ape.infrastructure.services;

import episen.android.ape.domain.student.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    Student findStudent(String studentID);

    Student deleteStudent(String studentID);

    Student updateStudent(Student student);

    List<Student> findAllStudents();
}
