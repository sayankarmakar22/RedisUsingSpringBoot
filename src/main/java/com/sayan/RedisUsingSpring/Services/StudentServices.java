package com.sayan.RedisUsingSpring.Services;

import com.sayan.RedisUsingSpring.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private RedisTemplate redisTemplate;
    private static final String HASH_Key = "Student";
    public Student save(Student student){
        redisTemplate.opsForHash().put(HASH_Key,student.getRoll(),student);
        return student;
    }

    public Student view(int id){
        Object fromRedis = redisTemplate.opsForHash().get(HASH_Key, id);
        return (Student) fromRedis;

    }
    public String delete(int id){
        redisTemplate.opsForHash().delete(HASH_Key,id);
        return "deleted "+ id;
    }

    public List<Student> findAll(){
        return redisTemplate.opsForHash().values(HASH_Key);
    }
}
