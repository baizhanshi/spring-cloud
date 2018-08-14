package com.bai.mapper;

import com.bai.domain.Student;
import com.bai.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by DELL on 2017/3/2.
 */
//@Mapper
public interface UserMapper {

    List<User> getAll();

    List<Student> getStudent();
}
