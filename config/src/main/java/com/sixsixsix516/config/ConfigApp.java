package com.sixsixsix516.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author sun 2020/2/25 19:05
 */
@ServletComponentScan(basePackages = "com.sixsixsix516.filter")
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApp.class, args);
    }

}
