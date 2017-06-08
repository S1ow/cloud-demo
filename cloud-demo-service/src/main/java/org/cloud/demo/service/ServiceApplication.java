package org.cloud.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaServer
public class ServiceApplication{
    public static void main( String[] args ){
        SpringApplication.run(ServiceApplication.class, args);
    }
}
