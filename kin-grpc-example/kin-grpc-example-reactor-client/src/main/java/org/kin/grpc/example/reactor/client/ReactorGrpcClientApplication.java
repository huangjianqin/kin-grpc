package org.kin.grpc.example.reactor.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author huangjianqin
 * @date 2022/7/5
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ReactorGrpcClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactorGrpcClientApplication.class, args);
    }
}
