package episen.android.ape.domain.student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    static List<Student> studentList;

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void addStudent(Student newStudent){
        if(studentList == null){
            studentList = new ArrayList<Student>();
            studentList.add(newStudent);
        }
        else {
            studentList.add(newStudent);
        }
    }

    public static void deleteStudent(String studentId){
        for(Student student : studentList){
            if(studentId.equals(student.getId())){
                studentList.remove(student);
            }
        }
    }

    public static Student getById(String studentId) {
        for(Student student: getStudentList()){
            if(student.getId().equals(studentId)){
                return student;
            }
        }
        return null;
    }

    public static void updateStudent(Student newStudent){
        Student studentToUpdate = getById(newStudent.getId());
        studentList.remove(studentToUpdate);
        studentList.add(newStudent);
    }

    public static List<Student> findAllStudents() {
        return studentList;
    }


}
