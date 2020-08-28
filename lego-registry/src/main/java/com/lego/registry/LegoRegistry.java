package com.lego.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: chenjingui
 * @Date: 2020/7/8 17:41
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class LegoRegistry {
    public static void main(String[] args) {
        SpringApplication.run(LegoRegistry.class,args);
    }
}
