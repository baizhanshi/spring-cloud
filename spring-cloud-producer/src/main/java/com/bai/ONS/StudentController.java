package com.bai.ONS;

import com.bai.domain.Student;
import com.bai.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by DELL on 2017/9/20.
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value = "/getStudent",method = RequestMethod.GET)
    public List<Student> getUserListByMybatis() {
        return userMapper.getStudent();
    }
}
