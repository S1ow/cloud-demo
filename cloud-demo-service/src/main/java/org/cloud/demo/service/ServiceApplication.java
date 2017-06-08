package org.cloud.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableAutoConfiguration
@SpringBootApplication
//@EnableEurekaServer //此服务即是eureka注册中心又是服务的提供者
@EnableEurekaClient
public class ServiceApplication{
    public static void main( String[] args ){
        SpringApplication.run(ServiceApplication.class, args);
    }
}
