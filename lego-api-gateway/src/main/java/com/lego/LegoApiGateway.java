package com.lego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: chenjingui
 * @Date: 2020/7/8 17:53
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LegoApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(LegoApiGateway.class, args);
    }
}
