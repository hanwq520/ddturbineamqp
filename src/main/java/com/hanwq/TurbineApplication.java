package com.hanwq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Configuration;

/**
 * Description: ddturbineamqp
 * Created by hanwq on 2019/5/22 14:37
 */
@Configuration
@EnableAutoConfiguration
@EnableTurbineStream
@EnableDiscoveryClient
public class TurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }
}
