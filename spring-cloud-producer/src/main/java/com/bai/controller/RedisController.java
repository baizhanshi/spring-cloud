package com.bai.controller;

import com.bai.utils.RedisCacheUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DELL on 2017/9/25.
 */
@RestController
public class RedisController {

    @Autowired
    private RedisCacheUtil redisCacheUtil;

    @RequestMapping("/redis")
    public Object hello() {
        redisCacheUtil.setCacheObject("abcd", "55555555");
        boolean exists = redisCacheUtil.hasKey("abcd");
        System.out.println(exists);
        Object bbbb = redisCacheUtil.getCacheObject("abcd");
        return bbbb.toString();
    }

}
