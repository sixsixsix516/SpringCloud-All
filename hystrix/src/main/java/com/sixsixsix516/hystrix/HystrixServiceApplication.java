package com.sixsixsix516.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sun
 */
@SpringCloudApplication
public class HystrixServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixServiceApplication.class, args);
    }

}
