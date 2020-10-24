package episen.android.ape.infrastructure.api;

import episen.android.ape.domain.student.Student;
import episen.android.ape.infrastructure.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    @ResponseBody
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") String studentId){
        return studentService.findStudent(studentId);
    }

    @GetMapping("/delete/student/{id}")
    public void deleteStudent(@PathVariable("id") String studentId){
        studentService.findStudent(studentId);
    }

    @PostMapping("/update/student")
    @ResponseBody
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.findAllStudents();
    }

}
