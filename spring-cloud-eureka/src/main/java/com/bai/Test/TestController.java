package com.bai.Test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by baizhanshi on 2018/3/23.
 */
@RestController
public class TestController {


    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public void test() {

        System.out.println("输出日志====================");

    }
}
