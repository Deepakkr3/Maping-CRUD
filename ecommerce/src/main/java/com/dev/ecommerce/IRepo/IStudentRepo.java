package com.dev.ecommerce.IRepo;

import com.dev.ecommerce.model.Student;
import org.hibernate.annotations.Cache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IStudentRepo extends JpaRepository<Student,String>{

}
