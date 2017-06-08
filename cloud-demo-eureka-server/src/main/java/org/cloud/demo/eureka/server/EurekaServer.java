package org.cloud.demo.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启Eureka服务，可以理解为注册中心？
public class EurekaServer {
	
    public static void main( String[] args ){
        SpringApplication.run(EurekaServer.class, args);
    }
}
