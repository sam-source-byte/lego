package com.lego;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: chenjingui
 * @Date: 2020/7/11 15:50
 * @Description:
 */
@SpringBootApplication()
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.lego.item.mapper"})
public class LeGoItemService {
    public static void main(String[] args) {
        SpringApplication.run(LeGoItemService.class, args);
    }
}
