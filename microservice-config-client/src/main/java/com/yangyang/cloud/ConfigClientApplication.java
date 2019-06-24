package com.yangyang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by chenshunyang on 2016/10/18.
 */
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
//        SpringApplication.run(ConfigClientApplication.class,args);
    	new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }
}
