package episen.android.ape.infrastructure.services;

import episen.android.ape.domain.student.Student;
import episen.android.ape.domain.student.StudentList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Override
    public Student createStudent(Student student) {
        StudentList.addStudent(student);
        return student;
    }

    @Override
    public Student findStudent(String studentId) {
        return StudentList.getById(studentId);
    }

    @Override
    public Student deleteStudent(String studentId) {
        StudentList.deleteStudent(studentId);
        return StudentList.getById(studentId);
    }

    @Override
    public Student updateStudent(Student student) {
        StudentList.updateStudent(student);
        return student;
    }

    @Override
    public List<Student> findAllStudents() {
        return StudentList.findAllStudents();
    }



}
