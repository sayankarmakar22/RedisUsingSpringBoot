package com.sayan.RedisUsingSpring.Services;

import com.sayan.RedisUsingSpring.Model.Student;
import com.sayan.RedisUsingSpring.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {
    @Autowired
    private StudentRepo studentRepo;

    public Student save(Student student){
        return studentRepo.save(student);
    }

    public Student view(int id){
        return studentRepo.findById(id).orElseThrow(()->new RuntimeException("user not exists"));
    }
}
