package com.dev.ecommerce.controll;

import com.dev.ecommerce.Service.StudentService;
import com.dev.ecommerce.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentControll {
    @Autowired
    StudentService studentService;
    @PostMapping("/student")
    public  String putStudent(@RequestBody List<Student> mystudent){
      return  studentService.putStudent(mystudent);

    }
    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
//    @DeleteMapping("delete")
//    public String deleteStudent(){
//        return studentService.deleteStudent();
//    }

}
