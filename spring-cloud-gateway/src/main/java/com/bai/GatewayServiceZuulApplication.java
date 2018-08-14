package com.bai;

import com.bai.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

//网关具有服务路由，负载均衡，还具有权限验证的功能
@SpringBootApplication
@EnableZuulProxy //启用路由代理
public class GatewayServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceZuulApplication.class, args);
    }

    //只有在这儿进行实例化  才可以使用filter
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
