package com.sayan.RedisUsingSpring.Repository;

import com.sayan.RedisUsingSpring.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
