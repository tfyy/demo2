package com.example.demo;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo2ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void text1(){
        System.out.println("1111@@@1");
    }

    @Test
    void contextLoads() {
        // 参数是一个 Wrapper , 条件构造器，这里我们先不用 null
        // 查询全部用户
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
