package com.bai.ONS;

import com.bai.domain.User;
import com.bai.domain.UserDTO;
import com.bai.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class HelloController {

    @Autowired
    private UserMapper userMapper;


    @Value("${neo.hello}")
    private String hello;

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public List<User> getUserListByMybatis() {
        return userMapper.getAll();
    }


    @RequestMapping(value = "/show", method = {RequestMethod.GET})
    public UserDTO show(@RequestParam(value = "id") Long id) {
        UserDTO dto = new UserDTO();
        dto.setId(id);
        dto.setName("scott");
        dto.setBirthday(new Date());
        return dto;
    }

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}