package com.dev.ecommerce.Service;

import com.dev.ecommerce.IRepo.IStudentRepo;
import com.dev.ecommerce.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String putStudent(List<Student> mystudent) {
        studentRepo.saveAll(mystudent);
        return "Student Saved";
    }

    public List<Student> getStudent() {
        return studentRepo.findAll();
    }

//    public String deleteStudent() {
//        studentRepo.deleteAll();
//        return "Student Deleted";
//    }
}
