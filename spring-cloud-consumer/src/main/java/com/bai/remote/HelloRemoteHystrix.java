package com.bai.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bai on 2017/5/15.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public Object getUserListByMybatis() {
        List<Object> objectList = new ArrayList<>();
        objectList.add("123");
        objectList.add("123");
        objectList.add("123");

        return objectList;
    }

    @Override
    public String getUser(@RequestParam(value = "id") Long id) {
        return "error";
    }

    @Override
    public String getFromRedis() {
        return "redis 缓存获取失败！！！！！";
    }

    @Override
    public String from() {
        return "消息总线rabbmit的测试失败！";
    }
}
