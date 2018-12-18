package com.bai.ONS;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author baizhanshi on 2018/12/18.
 */
@RestController
@RequestMapping("/ONS")
public class OnsController {

    @Resource
    private OnsProducer onsProducer;

    @RequestMapping(value = "/testmqProducer", method = RequestMethod.GET)
    public void testmq() {
        String msg = "testmq";
        onsProducer.sendMessage(MqConfigParams.TOPIC, "*", msg);

    }

}
