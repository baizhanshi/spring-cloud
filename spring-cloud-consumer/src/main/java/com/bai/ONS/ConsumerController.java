package com.bai.ONS;

import com.bai.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;

    @RequestMapping(value = "/getUsers",method = RequestMethod.GET)
    public Object getUserListByMybatis() {
        return HelloRemote.getUserListByMybatis();
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String add(@RequestParam(value = "id") Long id) {
        return HelloRemote.getUser(id);
    }


    @RequestMapping("/redis")
    public Object hello() {return HelloRemote.getFromRedis();}


    @RequestMapping("/hello")
    public String from() {return HelloRemote.from();}

}