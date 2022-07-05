package org.kin.grpc.springboot.client;

import net.devh.boot.grpc.client.autoconfigure.GrpcClientAutoConfiguration;
import net.devh.boot.grpc.client.stubfactory.BlockingStubFactory;
import org.kin.grpc.springboot.client.stubfactory.ReactorStubFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangjianqin
 * @date 2022/7/5
 */
@Configuration
@AutoConfigureAfter(GrpcClientAutoConfiguration.class)
public class ReactorGrpcAutoConfiguration {
    @Bean
    public ReactorStubFactory reactorStubFactory() {
        return new ReactorStubFactory();
    }
}
