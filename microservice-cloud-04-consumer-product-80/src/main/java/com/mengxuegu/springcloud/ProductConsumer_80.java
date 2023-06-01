package com.mengxuegu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: 刘广超
 */
@EnableEurekaClient //标识 是一个Eureka客户端
@SpringBootApplication
public class ProductConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80.class, args);
    }

}
