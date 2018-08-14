package com.bai.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bai on 2017/5/11.
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    Object getUserListByMybatis();


    @RequestMapping(method = RequestMethod.GET, value = "/show")
    String getUser(@RequestParam(value = "id") Long id);

    @RequestMapping(method = RequestMethod.GET, value = "/redis")
    String getFromRedis();

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String from();
}
