package org.cloud.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置服务中心
 *
 */

@SpringBootApplication
//只需要一个注解即开启了配置服务的管理
@EnableConfigServer
public class ConfigApplication{
	
    public static void main( String[] args ){
    	SpringApplication.run(ConfigApplication.class, args);
    }
}
