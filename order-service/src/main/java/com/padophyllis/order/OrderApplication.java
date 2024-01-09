package com.padophyllis.order;

import com.padophyllis.feign.client.UserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = {UserClient.class})
public class OrderApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
